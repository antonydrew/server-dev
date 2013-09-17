import java.util.Date;
import StudentCatalog;
import Finance;

public class BillingInfo {

	private double AmountDue;

	private Date DueDate;

	private int PaymentMethod;

	private double AmountPaid;

	private boolean Hold;
	
	private StudentName name;

	private StudentId id;
	
	public BillingInfo(StudentName namey, StudentId idy, double adue, Date ddate, int ccard, double apaid)
			{ name = namey; id = idy; AmountDue = adue; DueDate = ddate; PaymentMethod = ccard; AmountPaid = apaid}
	
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

	public double getBillAmount() {
		return AmountDue;
	}

	public void setBillAmount(double AmountDue) {
		this.AmountDue = AmountDue;
	}
	
	public Date getDueDate() {
		return DueDate;
	}
	
	public void setDueDate(Date DueDate) {
		this.DueDate = DueDate;
	}

	public int getPayCard() {
		return PaymentMethod;
	}

	public void setPayCard(int PaymentMethod) {
		this.PaymentMethod = PaymentMethod;
	}
	
	public double getPaidAmount() {
		return AmountPaid;
	}

	public void setPaidAmount(double AmountPaid) {
		this.AmountPaid = AmountPaid;
	}
	
	public boolean Hold = zero;
	
	public boolean CheckPastDueAmount(double AmountPaid, double AmountDue) {
		if (AmountPaid < AmountDue) Hold = 1 else Hold = 0;
		return Hold;
	}

}
