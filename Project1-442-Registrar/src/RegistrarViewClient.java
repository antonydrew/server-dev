//package com.ebook.view;

//import java.util.Date;
import java.util.List;
//import java.util.ArrayList;

//import com.ebook.model.customer.Address;
//import com.ebook.model.customer.Customer;
//import com.ebook.model.item.Book;
//import com.ebook.model.order.Order;
//import com.ebook.model.order.OrderDetail;
//import com.ebook.model.service.CustomerService;

public class RegistrarViewClient {
			
		public static void main (String args[]) throws Exception {
			
			
			
			// *** PLACE HOLDER - MUST ADD IN UNIT TESTS AT THE END TO MAKE SURE CLASSES/FUNCTIONS ARE WORKING CORRECTLY  *****   
			
			
			
			
			
			
//			
//			
//			
//			
//			//Client will use the customer service to have access to anything related to customer functionality.
//			CustomerService custService = new CustomerService();
//			
//	        //Find a customer if already exists; if not, create a new one.
//			//Customer customer = custService.findCustomerById("AY2345"); 
//			
	        Student freshman = new Student(124566,"CS");
			freshman.setName("Michael");
	        freshman.setLastName("Gerard");
	        freshman.setAddress("145 Nosband Ave Chicago IL 60660");
	        
	        //System.out.println(freshman.getName() + "\t" + freshman.getLastName());
	        
	        //System.out.println("Must add more unit tests for each class & methods in here and print to terminal");
	        
	        //Address billingAddress = new Address();
	        //billingAddress.setAddress1("500 West Madison St.");
	        //billingAddress.setAddress2("Suite 1000");
	        //billingAddress.setCity("Chicago");
	        //billingAddress.setState("IL");
	        //billingAddress.setZip("66610");
	        //customer.setBillingAddress(billingAddress);
//
//	        //Create order for the customer
	        StudentOrder order1 = new StudentOrder("K1234");
	        order1.setOrderID("BO-66734");
	        //System.out.println(order1.getOrderID());
//
//	        //Associate the order with the customer
//	        customer.addOrder(order1);
//	        
//	        //order detail contains products ordered
	        //First product
	        StudentOrderDetails course1 = new StudentOrderDetails(1235,3,true,"Comp 235: Logistics in Aerospace Programing");
	        course1.setCourseID(1235);
	        course1.setCredit(3);
	        course1.setCourseDescription("Comp 235: Logistics in Aerospace Programing");
	        //Add product to order
	        order1.addCourse(1235, 3, "Comp 235: Logistics in Aerospace Programing");
//	        
//	        //Second product
	        StudentOrderDetails course2 = new StudentOrderDetails(4567,3,true,"COMP 567: Quantum Computing & Applications");
	        course2.setCourseID(4567);
	        course2.setCredit(3);
	        course2.setCourseDescription("COMP 567: Quantum Computing & Applications");
	        //Add product to order
	        order1.addCourse(4567, 3, "COMP 567: Quantum Computing & Applications");
//	        
//	        //Third product
	        StudentOrderDetails course3 = new StudentOrderDetails(8473,3,true,"COMP 473: Video Game Programming");
	        course3.setCourseID(8473);
	        course3.setCredit(3);
	        course3.setCourseDescription("COMP 473: Video Game Programming");
	        //Add product to order
	        order1.addCourse(8473, 3, "COMP 473: Video Game Programming");       
//
//	        //Fourth product
	        StudentOrderDetails course4 = new StudentOrderDetails(9412,3,true,"COMP 412: White Hat Hacking");
	        course4.setCourseID(9412);
	        course4.setCredit(3);
	        course4.setCourseDescription("COMP 412: White Hat Hacking");
	        //Add product to order
	        order1.addCourse(9412, 3, "COMP 412: White Hat Hacking");
	        
	        //finish order	        
	        order1.confirmOrder();
//	        order1.orderPayed();
//	        
//	        // NOTE: To cancel the request, un-comment the following line.
//	        //order.cancel();
//	        
//	        // Then, comment out the next 2 lines.
//	        order1.orderSendOut();
//	        order1.orderDelivered();
//	        
//	        // Print out an order summary
//	        Address billingAdd = customer.getBillingAddress();
	        List<StudentOrderDetails> orderDetails = order1.getOrderDetails();
	        int orderTotalUnits = order1.getTotalOrderUnits();
//
//	        // Format order output
	        System.out.println("\tOrder Id: \t\t" + order1.getOrderID() + "\n");
	        System.out.println("\tOrder status: \t\t" + order1.getOrderState() + "\n");
	        System.out.println("\tStud Name: \t\t" + freshman.getName() + " " + freshman.getLastName() + "\n");
	        System.out.println("\tStud User ID: \t\t" + freshman.getSID() + "\n");
//
	        System.out.println("\tBilling Address:\t" + freshman.getAddress() + 
	        		//"\n\t\t\t\t" + billingAdd.getAddress2() + 
	        		//"\n\t\t\t\t" + billingAdd.getCity() + ", " + 
	        		//billingAdd.getState() + " " + billingAdd.getZip() +
	        		"\n");
//
	        System.out.println("\tOrder Items: ");
	        for (StudentOrderDetails line : orderDetails) {
	        	System.out.println("\t\t\t\t" + line.getCourseID() + "\t" + 
	        			+ line.getCredit()  + "\t" + line.getCourseDescription() );
	        }

	        System.out.println("\n\tStudent Order Total Credits:\t" + orderTotalUnits);
	        
	        Student_Term fall = new Student_Term();
	        fall.addOrder(order1);
	        Teacher adjunct = new Teacher(124567,"Adjunct Prof","CS");
			adjunct.setName("Joe");
	        adjunct.setLastName("Heller");
	        adjunct.setAddress("999 Keeler Ave Chicago IL 60660");
	        adjunct.addStudent(fall);
	        
	        System.out.println("\n\n\tProf Name: \t\t" + adjunct.getName() + " " + adjunct.getLastName() + "\n");
	        System.out.println("\tProf User ID: \t\t" + adjunct.getTeacherID() + "\n");
	        
	        int EnrolledCourseCredits = adjunct.getTotNumOfCredits(4567);
	        System.out.println("\n\tCourse 4567 Total Credits:\t" + EnrolledCourseCredits);
	        
	        //System.out.println("\n\nMust add more unit tests for each class & methods in here and print to terminal"); 
	        if (EnrolledCourseCredits < 24) {
	        	System.err.println("\n\nYou have NOT registered for a minimum of 24 credit hours, you are missing " + (24 - EnrolledCourseCredits) + " credit hours.");
	        	//method to return to add more classes.
	        }
	        	else {
	        		System.out.println("\n\nCongratulations! You have successfully registered for " + EnrolledCourseCredits + " credit hours.");
	        	}
	        
		}

}
