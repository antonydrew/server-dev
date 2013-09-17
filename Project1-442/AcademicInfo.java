import java.util.Date;
import Program;
import StudentCatalog;
import CourseCatalog;

public class AcademicInfo {

	private ProgramName prog;

	private String CompCourses;

	private int CompUnits;

	private Date GradDate;

	private String EnrolledCourses;

	private int EnrolledUnits;
	
	private CourseUnits coreunits;

	private double GPA;

	private boolean Hold;
	
	private StudentName name;

	private StudentId id;
	
	public AcademicInfo(StudentName namey, StudentId idy, ProgramName progy, int finunits, Date gdate, String encourses, double grades)
	{ name = namey; id = idy; prog = progy; CompUnits = finunits; GradDate = gdate; EnrolledCourses = encourses; GPA = grades}
	
	public String getName() {
		return name;
	}

	public void setName(StudentName name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(StudentId id) {
		this.id = id;
	}

	public String getProg() {
		return prog;
	}

	public void setProg(ProgramName prog) {
		this.prog = prog;
	}
	
	public String GetClassEnroll() {
		return EnrolledCourses;
	}
	
	public void setClassEnroll(String EnrolledCourses) {
		this.EnrolledCourses = EnrolledCourses;
	}

	public int getFinUnits() {
		return CompUnits;
	}

	public void setFinUnits(int CompUnits) {
		this.CompUnits = CompUnits;
	}
	
	public double getGrades() {
		return GPA;
	}

	public void setGrades(double GPA) {
		this.GPA = GPA;
	}
	
	public int AddCourse() {
		return 0;
	}

	public int DropCourse() {
		return 0;
	}

	public boolean Hold = zero;
	
	public boolean CheckRequirements(double GPA) {
		if (GPA < 2.0) Hold = 1 else Hold = 0;
		return Hold;
	}
	
	public int EnrolledUnits = 0;
	
	public int SumUnits(String EnrolledCourses, CourseUnits coreunits) {
		for (int d : ar) {  // MUST SWITCH OVER TO ARRAYS - FOREACH ELEMENT IN STRING ENROLLED COURSES, RETURN UNITS AND THEN SUM UP
		    EnrolledUnits += d;}
		return EnrolledUnits;
	}

}
