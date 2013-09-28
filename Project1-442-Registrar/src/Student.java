import java.util.Date;

public class Student extends User {

	private long stID;

	private String Department;

	private Date AdmissionDate;

	private String PayMethod;

	private boolean Immunization;

	//private Student_Course[] student_Course;

	//private Student_Term[] student_Term;

	//private StudentOrder[] studentOrder;

	public Student(long sid, String dept) {
		stID=sid;Department=dept;
	}

	public long getSID() {
		return stID;
	}

	public void setSID(long stID) {
		this.stID=stID;
	}

	public String getDept() {
		return Department;
	}

	public void setDept(String Department) {
		this.Department=Department;
	}

	public Date getAdDate() {
		return AdmissionDate;
	}

	public void setAdDate(Date AdmissionDate) {
		this.AdmissionDate=AdmissionDate;
	}

	public String getPayAc() {
		return PayMethod;
	}

	public void setPayAc(String PayMethod) {
		this.PayMethod=PayMethod;
	}

	public boolean getImmu() {
		return Immunization;
	}

	public void setImmu(boolean Immunization) {
		this.Immunization=Immunization;
	}
	
	public boolean checkImmu(boolean Immunization) {
		if (Immunization= false)  return true; else return false;			
	}
	

}
