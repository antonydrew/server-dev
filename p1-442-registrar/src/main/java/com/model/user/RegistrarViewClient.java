package com.model.user;

import java.util.ArrayList;
import java.util.List;

import com.model.course.Course;
import com.model.employee.Registrar;
import com.model.employee.Teacher;
import com.model.student.Student;
import com.model.student.StudentOrder;
import com.model.student.StudentOrderDetails;
import com.model.student.Student_Term;


public class RegistrarViewClient {
			
		public static void main (String args[]) throws Exception {
			
			System.out.println("\t\t\tRegistrar [Unit] Tests: Output\n\n\n");
			
			//Create New Registrar Employee so can create course and student catalogs for security
			Registrar permanent = new Registrar(11);
			permanent.setName("Jenny");
			permanent.setLastName("Jameson");
			permanent.setAddress("666 Love Lane Chicago IL 60639");       
	        System.out.println("\n\n\tRegistrar Name(Employee): \t\t" + permanent.getName() + " " + permanent.getLastName() + "\n");
	        System.out.println("\tRegistrar User ID: \t\t\t" + permanent.getRegID() + "\n");
			
			 //Create New Teacher plus functions
	        Teacher adjunct = new Teacher(124567,"Adjunct Prof","CS");
			adjunct.setName("Joe");
	        adjunct.setLastName("Heller");
	        adjunct.setAddress("999 Keeler Ave Chicago IL 60660");       
	        System.out.println("\n\n\tProfessor Name(Employee): \t\t" + adjunct.getName() + " " + adjunct.getLastName() + "\n");
	        System.out.println("\tProfessor User ID: \t\t\t" + adjunct.getTeacherID() + "\n");
			
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
			
			
			System.out.println("\n\tCourse Catalog\n");
			for (Course line : catalog) {
				  System.out.println("\t"+line.getDes()); }
			
			//Delete Course by Registrar
			System.out.println("\n\n");
			catalog.remove(course05);
			System.out.println("\tRevised Course Catalog - Course 555 Removed\n");
			for (Course line : catalog) {
				  System.out.println("\t"+line.getDes()); }
			
			System.out.println("\n\n");
			
			//Create New Students plus functions
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
	        System.out.println("\tOrder Id: \t\t" + order1.getOrderID() + "\n");
	        System.out.println("\tOrder status: \t\t" + order1.getOrderState() + "\n");
	        System.out.println("\tStud Name: \t\t" + freshman.getName() + " " + freshman.getLastName() + "\n");
	        System.out.println("\tStud User ID: \t\t" + freshman.getSID() + "\n");

	        System.out.println("\tBilling Address:\t" + freshman.getAddress() + "\n");

	        System.out.println("\tOrder Items: ");
	        for (StudentOrderDetails line : orderDetails) {
	        	System.out.println("\t\t\t\t" + line.getCourseID() + "\t" + 
	        			+ line.getCredit()  + "\t" + line.getCourseDescription() );}

	        System.out.println("\n\tStudent Total Credits:\t\t" + orderTotalUnits);
	           
	        //Create & append student order data to current Student Term
	        Student_Term fall = new Student_Term(freshman,2,2013,freshman.getLastName());
	        //Associate the order with the customer
	        fall.addOrder(order1,freshman);
	        
	        System.out.println("\n\tStudent Total Tution Amount($) Due:\t" + fall.getAmDue(freshman.getSID(), 1700.00));
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
	        System.out.println("\n\n\tOrder Id: \t\t" + order2.getOrderID() + "\n");
	        System.out.println("\tOrder status: \t\t" + order2.getOrderState() + "\n");
	        System.out.println("\tStud Name: \t\t" + transfer.getName() + " " + transfer.getLastName() + "\n");
	        System.out.println("\tStud User ID: \t\t" + transfer.getSID() + "\n");

	        System.out.println("\tBilling Address:\t" + transfer.getAddress() + "\n");

	        System.out.println("\tOrder Items: ");
	        for (StudentOrderDetails line : orderDetailss) {
	        	System.out.println("\t\t\t\t" + line.getCourseID() + "\t" + 
	        			+ line.getCredit()  + "\t" + line.getCourseDescription() );}

	        System.out.println("\n\tStudent Total Credits:\t\t" + orderTotalUnitss);
	           
	        //Create & append student order data to current Student Term
	        Student_Term falls = new Student_Term(transfer,2,2013,transfer.getLastName());
	        //Associate the order with the customer
	        falls.addOrder(order2,transfer);
	        
	        System.out.println("\n\tStudent Total Tution Amount($) Due:\t" + falls.getAmDue(transfer.getSID(), 1700.00));
	        falls.setAmDue(falls.getAmDue(transfer.getSID(), 1700.00));
	        
	        //Associate Course with Semester
	        course02.addStudentTerm(fall);  //Associate course with 1st student semester
	        course02.addStudentTerm(falls);  //Associate course with 2nd student semester
	        int EnrolledCourseCredits4567 = course02.getCourseTotNumOfCredits(4567);
	        System.out.println("\n\n\n\tCourse " +  course02.getCourseID() + " Total Enrolled Credits:\t" + EnrolledCourseCredits4567);
	        List CourseEnroll02 = new ArrayList();
	        CourseEnroll02.add(freshman.getLastName());
	        CourseEnroll02.add(transfer.getLastName());
	        
	        //Check Minimum enrollment
	        if (course02.checkMinEnroll(course02.getCourseID()) == false) {
	        	System.err.println("\n\tThis course must be cancelled since there are not at least " + (EnrolledCourseCredits4567) + " credit hours.");
	        	//method to return to add more classes.
	        }
	        	else {
	        		System.out.println("\n\tThis course is valid since there at least " + EnrolledCourseCredits4567 + " credit hours and so will NOT be cancelled.");
	        	}
	        
	        //Print out roster for course 02 (4567)
	        System.out.println("\n\tCourse Roster (By Last Name) for Course " + course02.getCourseID() + " taught by TeacherID " + course02.getTeachID() + ": ");
	        course02.getCourseRoster(course02.getCourseID());
	        System.out.println("\t"+CourseEnroll02);
	        
	        //Print total bill of all students for Registrar
	        System.out.println("\n\n\tTotal Billing Amount Due (of All Students) for School Registrars:\t" + (falls.getAmDue(transfer.getSID(), 1700.00) + fall.getAmDue(freshman.getSID(), 1700.00)));
	        
		}

}
