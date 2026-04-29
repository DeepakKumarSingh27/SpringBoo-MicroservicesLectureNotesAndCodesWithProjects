package in.ashokit;

public class DebitCard implements Ipayment{
	
	

	public DebitCard() {
		System.out.println("DebitCard  const.");
	}

	@Override
	public String pay(Double amount) {
		// TODO Auto-generated method stub
		return "payment successful through DebitCard";
	}

}
