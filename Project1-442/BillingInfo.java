import java.util.Date;

public class BillingInfo {

	private double AmountDue;

	private Date DueDate;

	private int PaymentMethod;

	private double AmountPaid;

	private boolean Hold;

	public double GetBillAmount() {
		return 0;
	}

	public Date GetDueDate() {
		return null;
	}

	public boolean CheckPastDueAmount() {
		return false;
	}

}
