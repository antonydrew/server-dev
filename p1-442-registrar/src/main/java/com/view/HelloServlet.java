package com.view;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.course.Course;
import com.model.course.Subject;
import com.model.employee.Employee;
import com.model.employee.Registrar;
import com.model.employee.Teacher;
import com.model.student.Student;
import com.model.student.StudentOrder;
import com.model.student.StudentOrderDetails;
import com.model.student.Student_Course;
import com.model.student.Student_Term;
import com.model.user.User;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class HelloServlet extends HttpServlet {

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        
        out.write("\t\t\tRegistrar [Unit] Tests: Output\n\n\n".getBytes());
        
        //Add Registrar Employee so can create course and student catalogs
		Registrar permanent = new Registrar(11);
		permanent.setName("Jenny");
		permanent.setLastName("Jameson");
		permanent.setAddress("666 Love Lane Chicago IL 60639");       
		out.write(("\n\n\tRegistrar Name(Employee): \t\t" + permanent.getName() + " " + permanent.getLastName() + "\n").getBytes());
		out.write(("\tRegistrar User ID: \t\t\t" + permanent.getRegID() + "\n").getBytes());
		
		//Create New Teacher plus functions
        Teacher adjunct = new Teacher(124567,"Adjunct Prof","CS");
		adjunct.setName("Joe");
        adjunct.setLastName("Heller");
        adjunct.setAddress("999 Keeler Ave Chicago IL 60660");       
        out.write(("\n\n\tProfessor Name: \t\t\t" + adjunct.getName() + " " + adjunct.getLastName() + "\n").getBytes());
        out.write(("\tProfessor User ID: \t\t\t" + adjunct.getTeacherID() + "\n").getBytes());
        
		//Create new Course catalog and fill
		List<Course> catalog = new ArrayList<Course>();
		
		Course course01 = new Course(permanent.getEmpID(),1235, adjunct.getTeacherID(), 2, 2013, "0900", 3, "Comp 235: Logistics in Aerospace Programing");
		catalog.add(course01);
		
		Course course02 = new Course(permanent.getEmpID(),4567, adjunct.getTeacherID(), 2, 2013, "1300", 3, "COMP 567: Quantum Computing & Applications");
		catalog.add(course02);
		
		Course course03 = new Course(permanent.getEmpID(),8473, adjunct.getTeacherID(), 2, 2013, "1900", 3, "COMP 473: Video Game Programming");
		catalog.add(course03);
		
		Course course04 = new Course(permanent.getEmpID(),9412, adjunct.getTeacherID(), 2, 2013, "1600", 3, "COMP 412: White Hat Hacking");
		catalog.add(course04);	
		
		Course course05 = new Course(permanent.getEmpID(),5555, adjunct.getTeacherID(), 2, 2013, "1100", 3, "COMP 555: XML & Markup Languages");
		catalog.add(course05);	
		
		
		out.write("\n\n\tCourse Catalog\n".getBytes());
		for (Course line : catalog) {
			out.write(("\t"+line.getDes()+"\n").getBytes()); }
		
		//Delete Course by Registrar
		out.write("\n\n".getBytes());
		catalog.remove(course05);
		out.write("\tRevised Course Catalog - Course 555 Removed\n".getBytes());
		for (Course line : catalog) {
			out.write(("\t"+line.getDes()+"\n").getBytes()); }
		
		out.write("\n\n".getBytes());
        
        Student freshman = new Student(124566,"CS");
		freshman.setName("Michael");
        freshman.setLastName("Gerard");
        freshman.setAddress("145 Nosband Ave Chicago IL 60660");
        
        //Create order for the customer
        StudentOrder order1 = new StudentOrder("K1234");

        //First product
        StudentOrderDetails course1 = new StudentOrderDetails(freshman.getSID(),course01.getCourseID(),course01.getUnits(),true,course01.getDes());
        //Add product to order
        order1.addCourse(freshman.getSID(),course01.getCourseID(),course01.getUnits(),course01.getDes());
    
        //Second product
        StudentOrderDetails course2 = new StudentOrderDetails(freshman.getSID(),course02.getCourseID(),course02.getUnits(),true,course02.getDes());
        //Add product to order
        order1.addCourse(freshman.getSID(),course02.getCourseID(),course02.getUnits(),course02.getDes());
        
        //Third product
        StudentOrderDetails course3 = new StudentOrderDetails(freshman.getSID(),course03.getCourseID(),course03.getUnits(),true,course03.getDes());
        //Add product to order
        order1.addCourse(freshman.getSID(),course03.getCourseID(),course03.getUnits(),course03.getDes());       
        
        //Fourth product
        StudentOrderDetails course4 = new StudentOrderDetails(freshman.getSID(),course04.getCourseID(),course04.getUnits(),true,course04.getDes());
        //Add product to order
        order1.addCourse(freshman.getSID(),course04.getCourseID(),course04.getUnits(),course04.getDes());
        
        //finish order	        
        order1.confirmOrder();
        
        // NOTE: To cancel the request, un-comment the following line.
        //order.cancel();
    
        // Print out an order summary
        List<StudentOrderDetails> orderDetails = order1.getOrderDetails();
        int orderTotalUnits = order1.getTotalOrderUnits(freshman.getSID());

        // Format order output
        out.write(("\tOrder Id: \t\t" + order1.getOrderID() + "\n").getBytes());
        out.write(("\tOrder status: \t\t" + order1.getOrderState() + "\n").getBytes());
        out.write(("\tStud Name: \t\t" + freshman.getName() + " " + freshman.getLastName() + "\n").getBytes());
        out.write(("\tStud User ID: \t\t" + freshman.getSID() + "\n").getBytes());

        out.write(("\tBilling Address:\t" + freshman.getAddress() + "\n").getBytes());

        out.write("\tOrder Items: ".getBytes());
        for (StudentOrderDetails line : orderDetails) {
        	out.write(("\n\t\t\t\t" + line.getCourseID() + "\t" + 
        			+ line.getCredit()  + "\t" + line.getCourseDescription()+"\n").getBytes());}

        out.write(("\n\tStudent Total Credits:\t\t" + orderTotalUnits).getBytes());
           
        //Create & append student order data to current Student Term
        Student_Term fall = new Student_Term(freshman,2,2013,freshman.getLastName());
        //Associate the order with the customer
        fall.addOrder(order1,freshman);
        
        out.write(("\n\tStudent Total Tution Amount($) Due:\t" + fall.getAmDue(freshman.getSID(), 1700.00)).getBytes());
        fall.setAmDue(fall.getAmDue(freshman.getSID(), 1700.00));
        
        //Create Second New Students plus functions
        Student transfer = new Student(444566,"CAS");
		transfer.setName("John");
        transfer.setLastName("Kelly");
        transfer.setAddress("480 Victory Ave Chicago IL 60603");
        
        //Create order for the customer
        StudentOrder order2 = new StudentOrder("F1233");

        //First product
        StudentOrderDetails course11 = new StudentOrderDetails(transfer.getSID(),course01.getCourseID(),course01.getUnits(),true,course01.getDes());
        //Add product to order
        order2.addCourse(transfer.getSID(),course01.getCourseID(),course01.getUnits(),course01.getDes());
    
        //Second product
        StudentOrderDetails course22 = new StudentOrderDetails(transfer.getSID(),course02.getCourseID(),course02.getUnits(),true,course02.getDes());
        //Add product to order
        order2.addCourse(transfer.getSID(),course02.getCourseID(),course02.getUnits(),course02.getDes());
        
        
        //finish order	        
        order2.confirmOrder();
        
        // NOTE: To cancel the request, un-comment the following line.
        //order.cancel();
    
        // Print out an order summary
        List<StudentOrderDetails> orderDetailss = order2.getOrderDetails();
        int orderTotalUnitss = order2.getTotalOrderUnits(transfer.getSID());

        // Format order output
        out.write(("\n\n\tOrder Id: \t\t" + order2.getOrderID() + "\n").getBytes());
        out.write(("\tOrder status: \t\t" + order2.getOrderState() + "\n").getBytes());
        out.write(("\tStud Name: \t\t" + transfer.getName() + " " + transfer.getLastName() + "\n").getBytes());
        out.write(("\tStud User ID: \t\t" + transfer.getSID() + "\n").getBytes());

        out.write(("\tBilling Address:\t" + transfer.getAddress() + "\n").getBytes());

        out.write(("\tOrder Items: ").getBytes());
        for (StudentOrderDetails line : orderDetailss) {
        	out.write(("\n\t\t\t\t" + line.getCourseID() + "\t" + 
        			+ line.getCredit()  + "\t" + line.getCourseDescription() + "\n").getBytes());}

        out.write(("\n\tStudent Total Credits:\t\t" + orderTotalUnitss).getBytes());
           
        //Create & append student order data to current Student Term
        Student_Term falls = new Student_Term(transfer,2,2013,transfer.getLastName());
        //Associate the order with the customer
        falls.addOrder(order2,transfer);
        
        out.write(("\n\tStudent Total Tution Amount($) Due:\t" + falls.getAmDue(transfer.getSID(), 1700.00)).getBytes());
        falls.setAmDue(falls.getAmDue(transfer.getSID(), 1700.00));
        
        //Associate Course with Semester
        course02.addStudentTerm(fall);  //Associate course with 1st student semester
        course02.addStudentTerm(falls);  //Associate course with 2nd student semester
        int EnrolledCourseCredits4567 = course02.getCourseTotNumOfCredits(4567);
        out.write(("\n\n\n\tCourse " +  course02.getCourseID() + " Total Enrolled Credits:\t" + EnrolledCourseCredits4567).getBytes());
        List CourseEnroll02 = new ArrayList();
        CourseEnroll02.add(freshman.getLastName());
        CourseEnroll02.add(transfer.getLastName());
        
        //Check Minimum enrollment
        if (course02.checkMinEnroll(course02.getCourseID()) == false) {
        	out.write(("\n\tThis course must be cancelled since there are not at least " + (EnrolledCourseCredits4567) + " credit hours.").getBytes());
        	//method to return to add more classes.
        }
        	else {
        		out.write(("\n\tThis course is valid since there at least " + EnrolledCourseCredits4567 + " credit hours and so will NOT be cancelled.").getBytes());
        	}
        
        //Print out roster for course 02 (4567)
        out.write(("\n\tCourse Roster (By Last Name) for Course " + course02.getCourseID() + " taught by TeacherID " + course02.getTeachID() + ": ").getBytes());
        course02.getCourseRoster(course02.getCourseID());
        out.write(("\t"+CourseEnroll02).getBytes());
        
        //Print total bill of all students for Registrar
        out.write(("\n\n\tTotal Billing Amount Due (of All Students) for School Registrar:\t" + (falls.getAmDue(transfer.getSID(), 1700.00) + fall.getAmDue(freshman.getSID(), 1700.00))).getBytes());
        
        
        out.flush();
        out.close();
    }
    
}
