public class StudentOrderDetails {

	private int CourseID;

	private int Credits;

	private boolean IsApproved;
	
	private String CourseDescription;

	private Course course;

	public StudentOrderDetails(int cid, int units, boolean valid, String des) {
			CourseID=cid; Credits=units; IsApproved=valid; CourseDescription=des;
	}

	public int getCourseID() {
		return CourseID;
	}

	public void setCourseID(int CourseID) {
		this.CourseID=CourseID;
	}

	public int getCredit() {
		return Credits;
	}

	public void setCredit(int Credits) {
		this.Credits=Credits;
	}

	public boolean getValidation() {
		return IsApproved;
	}

	public void setValidation(boolean IsApproved) {
		this.IsApproved=IsApproved;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course=course;
	}
	
	public String getCourseDescription() {
		return CourseDescription;
	}

	public void setCourseDescription(String CourseDescription) {
		this.CourseDescription=CourseDescription;
	}

}
