import java.util.Date;

public class Course {

	private int CourseID;

	private int Term;

	private Date StartDate;

	private Date EndDate;

	private String Time;

	private int Credits;

	//private Student_Course[] student_Course;

	//private Subject subject;

	//private Teacher teacher;

	public Course(int cid, int turm, Date sdate, Date edate, String tme, int units) {
		CourseID=cid;Term=turm;StartDate=sdate;EndDate=edate;Time=tme;Credits=units;
	}

	public int getCourseID() {
		return CourseID;
	}

	public void setCourseID(int CourseID) {
		this.CourseID=CourseID;
	}

	public int getTerm() {
		return Term;
	}

	public void setTerm(int Term) {
		this.Term=Term;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date StartDate) {
		this.StartDate=StartDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date EndDate) {
		this.EndDate=EndDate;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String Time) {
		this.Time=Time;
	}

	public int getUnits() {
		return Credits;
	}

	public void setUnits(int Credits) {
		this.Credits=Credits;
	}
	
	public void hello ()
	{}

}
