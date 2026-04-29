package in.ashokit;

public class BillCollector {
	private Ipayment payment;

	public BillCollector() {
		// TODO Auto-generated constructor stub
	}

	public BillCollector(Ipayment payment) {
		this.payment = payment;
	}

	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}

	public void collectPayment(Double amount) {
		String status = payment.pay(amount);
		System.out.println(status);

	}
}
