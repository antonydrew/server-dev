import java.util.List;
import java.util.ArrayList;

public class StudentOrder {

	private String OrderID;

	private List<StudentOrderDetails> orderDetails = new ArrayList<StudentOrderDetails>();

	private String OrderState = "Open";

	private Student student;

	//private StudentOrderDetails[] studentOrderDetails;

	public StudentOrder(String oid) {
		OrderID=oid;
	}

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String OrderID) {
		this.OrderID=OrderID;
	}

	public List<StudentOrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<StudentOrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOrderState() {
		return OrderState;
	}

	public void setOrderState(String OrderState) {
		this.OrderState=OrderState;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student=student;
	}

	public void addCourse(int CourseID, int Credits, String CourseDescription) {
		if (OrderState.equals("Open")) {
			orderDetails.add(new StudentOrderDetails(CourseID, Credits, false, CourseDescription));
		} else {
			throw new IllegalStateException("Can only add product if class is open.");
		}
	}

	public void dropCourse(int CourseID, int Credits, String CourseDescription) {
		if (OrderState.equals("Open")) {
			orderDetails.remove(new StudentOrderDetails(CourseID, Credits, false, CourseDescription));
		} else {
			throw new IllegalStateException("Can only add product if class is open.");
		}
	}

	public void confirmOrder() {
		if (getOrderDetails().isEmpty()) {
			OrderState = "Canceled";
		} else if (OrderState.equals("Open")) {
			OrderState = "Ordered";
		} else {
			throw new IllegalStateException("Cannot confirm order in this state.");
		}
	}

	public void cancelOrder() {
		if (OrderState.equals("Open") || OrderState.equals("Ordered")) {
			OrderState = "Canceled";
		} else {
			throw new IllegalStateException("Cannot cancel order in this state.");
		}
	}

	public int getTotalOrderUnits() {
		int total = 0;
		for (StudentOrderDetails line : orderDetails) {
			total += line.getCredit();
		}
		return total;
	}
	
	public int getCourseEnrollment(int CourseID) {
		int total = 0;
		for (StudentOrderDetails line : orderDetails) {
			if (CourseID == line.getCourseID()) total += line.getCredit();
		}
		return total;
	}

}
