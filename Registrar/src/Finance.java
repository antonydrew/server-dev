import java.util.Date;
import StudentCatalog;

public class Finance {

	private Date BillingDate;

	private int BillingId;

	private double BillingAmount;

	private StudentName name;

	private StudentId id;
	
	public Finance(StudentName namey, StudentId idy, Date bdate, int bid, double bill)
	{ name = namey; id = idy; BillingDate = bdate; BillingId = bid; BillingAmount = bill; }
	
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
	
	public Date getBillDate() {
		return BillingDate;
	}

	public void setBillDate(Date BillingDate) {
		this.BillingDate = BillingDate;
	}

	public int getBillId() {
		return BillingId;
	}

	public void setBillId(int BillingId) {
		this.BillingId = BillingId;
	}
	
	public double getBill() {
		return BillingAmount;
	}

	public void setBill(double BillingAmount) {
		this.BillingAmount = BillingAmount;
	}
	
	public String toString() 
	{ return name + "," + id + "," + BillingDate + "," + BillingId + "," + BillingAmount;}

}
