import java.util.ArrayList;
import java.util.List;


public class Teacher extends Employee {
	
	private long TeacherID;

	private String Title;

	private String Department;

	private Course course;
	
	private List<Student_Term> students = new ArrayList<Student_Term>();

	public Teacher(long tid, String tit, String dept) {
		TeacherID=tid;Title=tit;Department=dept;
	}

	public long getTeacherID() {
		return TeacherID;
	}

	public void setTeacherID(long TeacherID) {
		this.TeacherID=TeacherID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title=Title;
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
	
	public int getCourseEnrollment(int CourseID) {
		return 0;
	}
	
	public List<Student_Term> getStudents() {
		return students;
	}

	public void setStudents(List<Student_Term> students) {
		this.students = students;
	}
	
	public void addStudent(Student_Term student) {
		students.add(student);
	}

	
	public boolean checkMinEnrol(int CourseID) {
		if (getTotNumOfCredits(CourseID) < 3) return false; else return true;
	}
	
	public int getTotNumOfCredits(int CourseID) {
		int NumOfCredits = 0;
		for (Student_Term line : students) {
			NumOfCredits += line.getCourseCredits(CourseID);
		}
		return NumOfCredits;
	}

	
}
