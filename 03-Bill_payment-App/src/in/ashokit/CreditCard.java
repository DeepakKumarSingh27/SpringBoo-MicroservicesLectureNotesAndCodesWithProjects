package in.ashokit;

public class CreditCard implements Ipayment {

	@Override
	public String pay(Double amount) {
	
		return "payment successful through creditCard";
	}


	
}
