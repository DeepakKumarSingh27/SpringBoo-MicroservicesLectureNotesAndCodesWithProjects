package in.ashokit;

public class UpiPayment implements Ipayment {

	
	public UpiPayment() {
		System.out.println("Upi cinst");
	}

	@Override
	public String pay(Double amount) {
		// TODO Auto-generated method stub
		return "payment successful through Upi";
	}

}
