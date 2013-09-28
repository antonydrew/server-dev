public class Subject {

	private int SubjectID;

	private String Name;

	private String Department;

	private Course course;

	public Subject(int subID, String snam, String dept) {
		SubjectID=subID;Name=snam;Department=dept;
	}

	public int getSubID() {
		return SubjectID;
	}

	public void setSubID(int SubjectID) {
		this.SubjectID=SubjectID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name=Name;
	}

	public String getDept() {
		return Department;
	}

	public void setDept(String Department) {
		this.Department=Department;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course=course;
	}

}
