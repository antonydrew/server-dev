package
import StudentCatalog;

public class MedicalInfo {

	private boolean Immunization;

	//private boolean Hold;
	
	private StudentName name;

	private StudentId id;

	public MedicalInfo(StudentName namey, StudentId idy, boolean immu)
	{ name = namey; id = idy; Immunization = immu; }
	
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

	public boolean Hold = false;
	
	public boolean CheckRecords(boolean Immunization) {
		if (Immunization= false)  {Hold = true;}
				else { Hold = false;}
		return Hold;
	}

}
