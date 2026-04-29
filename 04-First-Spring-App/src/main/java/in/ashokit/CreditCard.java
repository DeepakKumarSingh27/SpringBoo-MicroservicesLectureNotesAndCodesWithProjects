package in.ashokit;

public class CreditCard implements Ipayment {

	public CreditCard() {
		System.out.println("CreditCard const..");
	}

	@Override
	public String pay(Double amount) {
	
		return "payment successful through creditCard";
	}


	
}
