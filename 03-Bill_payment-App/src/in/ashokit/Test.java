package in.ashokit;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
       // BillCollector bc = new BillCollector();
        // setter injection
       // bc.setPayment(new CreditCard());
        // constructor injection
        //BillCollector bc1 = new BillCollector(new CreditCard());
       // bc1.collectPayment(12.00);
	      //bc.payment = cc;
	      //CreditCard ccd = new CreditCard();
	      Class<?> clz = Class.forName("in.ashokit.BillCollector");
	      Object obj = clz.newInstance();
	      BillCollector bc = (BillCollector) obj;
	      Field field = clz.getDeclaredField("payment");
	      field.setAccessible(true);
	      field.set(obj, new CreditCard());
	      bc.collectPayment(200.00);
		  
	}

}
