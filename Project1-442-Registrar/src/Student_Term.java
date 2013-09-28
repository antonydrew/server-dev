import java.util.Date;
import java.util.List;
import java.util.ArrayList;
//import java.math.*;

public class Student_Term {

	private Date RegisterDate;

	private int Semester;

	private int NumOfCredits;

	private double AmountDue;

	private Double AmountPaid;

	private Date DueDate;

	private float GPA;

	private Student student;

	private List<StudentOrder> orders = new ArrayList<StudentOrder>();
	
	public Student_Term() {};

//	public Student_Term(Date regdat, int sem, double adue, double apaid, Date ddate) {
//		RegisterDate=regdat;Semester=sem;AmountDue=adue;AmountPaid=apaid;DueDate=ddate;
//	}

	public Date getRegDate() {
		return RegisterDate;
	}

	public void setRegDate(Date RegisterDate) {
		this.RegisterDate=RegisterDate;
	}

	public int getSemester() {
		return Semester;
	}

	public void setSemester(int Semester) {
		this.Semester=Semester;
	}

	public double getAmDue() {
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
	
	public void addOrder(StudentOrder order) {
		orders.add(order);
	}

	public float getGPA() {
		GPA = 0;
		return GPA;
	}

	public int getNumOfCredits() {
		NumOfCredits = 0;
		for (StudentOrder line : orders) {
			NumOfCredits += line.getTotalOrderUnits();
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
	
	public boolean checkGradeReq(float GPA) {
		if (GPA < 2.0) {HoldG = true;}
		else { HoldG = false;}
		return HoldG;
	}
	
}
