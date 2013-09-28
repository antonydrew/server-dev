import java.util.Date;

public class Employee extends User {

	private long EmployeeID;

	private Date HireDate;

	public Employee() {};
	
//	public Employee(long eid, Date hdate) {
//		EmployeeID=eid;HireDate=hdate;
//	}

	public long getEmpID() {
		return EmployeeID;
	}

	public void setEmpID(long EmployeeID) {
		this.EmployeeID=EmployeeID;
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date HireDate) {
		this.HireDate=HireDate;
	}

}
