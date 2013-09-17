public class Program {

	private String ProgramName;

	private String ReqCourses;

	private int ReqUnits;

	public Program(String pname, String reqc, int requ)
	{ ProgramName = pname; ReqCourses = reqc; ReqUnits = requ; }
	
	public String getProgramName() {
		return ProgramName;
	}

	public void setProgramName(String ProgramName) {
		this.ProgramName = ProgramName;
	}
	
	public String getReqCourses() {
		return ReqCourses;
	}

	public void setReqCourses(String ReqCourses) {
		this.ReqCourses = ReqCourses;
	}
	
	public int getReqUnits() {
		return ReqUnits;
	}

	public void setReqUnits(int ReqUnits) {
		this.ReqUnits = ReqUnits;
	}

}
