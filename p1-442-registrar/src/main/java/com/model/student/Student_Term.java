package com.model.student;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Student_Term {

	private Date RegisterDate;

	private int Semester;

	private int NumOfCredits;
	
	private int Year;
	
	private String LastName;

	private double AmountDue;

	private Double AmountPaid;

	private Date DueDate;

	private float GPA;

	private Student student;

	private List<StudentOrder> orders = new ArrayList<StudentOrder>();

	public Student_Term(Student study, int sem, int yr, String lName) {
		student=study;Semester=sem; Year=yr; LastName=lName;
	}

	public Date getRegDate() {
		return RegisterDate;
	}

	public void setRegDate(Date RegisterDate) {
		this.RegisterDate=RegisterDate;
	}
	
	public String getLname() {
		return LastName;
	}

	public void setLname(String LastName) {
		this.LastName=LastName;
	}

	public int getSemester() {
		return Semester;
	}

	public void setSemester(int Semester) {
		this.Semester=Semester;
	}
	
	public int getYR() {
		return Year;
	}

	public void setYR(int Year) {
		this.Year=Year;
	}

	public double getAmDue(long StudentID, double CostCredit) {
		Double AmountDue = 0.00;
		AmountDue = getNumOfCredits(StudentID) * CostCredit;
		return AmountDue;
	}

	public void setAmDue(double AmountDue) {
		this.AmountDue=AmountDue;
	}
	
	public double getAmPaid() {
		return AmountPaid;
	}

	public void setAmPaid(double AmountPaid) {
		this.AmountPaid=AmountPaid;
	}

	public Date getDueDate() {
		return DueDate;
	}

	public void setDueDate(Date DueDate) {
		this.DueDate=DueDate;
	}
	
	public List<StudentOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<StudentOrder> orders) {
		this.orders = orders;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student=student;
	}
	
	public void addOrder(StudentOrder order, Student student) {
		orders.add(order);
	}

	public float getGPA() {
		return GPA;
	}
	
	public void setGPA(float GPA) {
		this.GPA=GPA;
	}

	public int getNumOfCredits(long StudentID) {
		NumOfCredits = 0;
		for (StudentOrder line : orders) {
			NumOfCredits += line.getTotalOrderUnits(StudentID);
		}
		return NumOfCredits;
	}

	public int getCourseCredits(int CourseID) {
		NumOfCredits = 0;
		for (StudentOrder line : orders) {
			NumOfCredits += line.getCourseEnrollment(CourseID);
		}
		return NumOfCredits;
	}
	
	public boolean HoldB = false;
	
	public boolean checkPastDueAmount(double AmountPaid, double AmountDue) {
		if (AmountPaid < AmountDue) {HoldB = true;}
		else { HoldB = false;}
		return HoldB;
	}

	public boolean HoldG = false;
	
	public boolean checkGradeReq(float GPA, long StudentID) {
		if (GPA < 2.0) {HoldG = true;}
		else { HoldG = false;}
		return HoldG;
	}
	
}
