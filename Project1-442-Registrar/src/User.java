public class User {

	private long UserID;

	private String UserName;

	private long Phone;

	private String Email;

	private String Name;

	private String LastName;

	private int BirthDate;

	private int SSN;

	private char Gender;
	
	private String Address;

	private boolean IsApproved;
	
	public User() {};
	
//	public User(long id, String uname, long phon, String maile, String nam, String lnam, int bdat, int ss, char gen, boolean valid) {
//		UserID=id;Phone=phon;Email=maile;Name=nam;LastName=lnam;BirthDate=bdat;SSN=ss;Gender=gen;IsApproved=valid;
//	}

	public long getUserID() {
		return UserID;
	}

	public void SetUserID(long UserID) {
		this.UserID=UserID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName=UserName;
	}

	public long getPhone() {
		return Phone;
	}

	public void SetPhone(long Phone) {
		this.Phone=Phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email=Email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name=Name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName=LastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address=Address;
	}
	
	public int getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(int BirthDate) {
		this.BirthDate=BirthDate;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int SSN) {
		this.SSN=SSN;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char Gender) {
		this.Gender=Gender;
	}

	public boolean getValidation() {
		return IsApproved;
	}

	public void setValidation(boolean IsApproved) {
		this.IsApproved=IsApproved;
	}

}
