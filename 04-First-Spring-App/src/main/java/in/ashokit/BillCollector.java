package in.ashokit;

public class BillCollector {
	private Ipayment payment;

	public BillCollector() {
	}

	public BillCollector(Ipayment payment) {
		System.out.println("Param const excute..");
		this.payment = payment;
	}

	public void setPayment(Ipayment payment) {
		System.err.println("setpayment() :: executed");
		this.payment = payment;
	}

	public void collectPayment(Double amount) {
		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);

	}
}
