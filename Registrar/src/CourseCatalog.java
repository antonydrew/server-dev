package
import Registrar.src.AcademicInfo;
//import Math;

public class CourseCatalog {

	private String CourseName;

	private int CourseNumber;
	
	private int CourseUnits;

	private String CourseInstructor;
	
	public CourseCatalog(String cname, int cid, String prof, int corunits)
	{ CourseName = cname; CourseNumber = cid; CourseInstructor = prof; CourseUnits = corunits;}
	
	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}

	public int getCourseId() {
		return CourseNumber;
	}

	public void setCourseId(int CourseNumber) {
		this.CourseNumber = CourseNumber;
	}
	
	public int getCourseUnits() {
		return CourseUnits;
	}

	public void setCourseUnits(int CourseUnits) {
		this.CourseUnits = CourseUnits;
	}
	
	public String getInstructor() {
		return CourseInstructor;
	}

	public void setInstructor(String CourseInstructor) {
		this.CourseInstructor = CourseInstructor;
	}
	
	//needs more work
	public String GetCourseEnrollment() {
		return null;
	}

	//needs more work
	public boolean CheckMinEnroll() {
		if (sum(AcademicInfo.EnrolledUnits) < 3) return false; else return true;
	}

}
