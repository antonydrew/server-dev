//import java.util.ArrayList;
//import java.util.List;

public class StudentCatalog {

	private String StudentName;

	private long StudentId;

	private String StudentAddress;

	private int StudentPhone;

	public StudentCatalog(String name, long id, String address, int phone)
	{ StudentName = name; StudentId = id; StudentAddress = address; StudentPhone = phone; }
	
	public String getName() {
		return StudentName;
	}

	public void setName(String StudentName) {
		this.StudentName = StudentName;
	}
	
	public long getId() {
		return StudentId;
	}

	public void setId(long StudentId) {
		this.StudentId = StudentId;
	}
	
	public String getAddress() {
		return StudentAddress;
	}

	public void setAddress(String StudentAddress) {
		this.StudentAddress = StudentAddress;
	}

	public int getPhone() {
		return StudentPhone;
	}

	public void setPhone(int Studentphone) {
		this.StudentPhone = StudentPhone;
	}
	
	

}
