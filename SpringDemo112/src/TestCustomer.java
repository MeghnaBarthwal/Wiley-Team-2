import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer;

public class TestCustomer {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer c =(Customer) context.getBean("customer1");
		System.out.println(c);
		System.out.println(c.getCustomerAddress().getAddressCity());
		System.out.println(c.getCustomerAddress().getAddressState());
		
	}
	
}
