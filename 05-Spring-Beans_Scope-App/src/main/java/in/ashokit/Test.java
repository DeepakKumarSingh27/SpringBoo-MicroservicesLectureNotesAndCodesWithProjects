package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		Car car1 = context.getBean("car", Car.class);
		System.out.println(car1.hashCode());

		Car car2 = context.getBean("car", Car.class);
		System.out.println(car2.hashCode());

	}

}
