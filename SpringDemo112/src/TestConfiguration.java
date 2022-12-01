import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anno.bean.Customer;
import com.anno.bean.CustomerConfiguration;

public class TestConfiguration {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);
		Customer c =(Customer) context.getBean("customer123");
		System.out.println(c.getCustomerId()+ c.getCustomerName());
	}
}
