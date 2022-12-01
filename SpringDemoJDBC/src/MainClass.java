import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer;
import com.anno.bean.CustomerDAO;
//import com.anno.bean.CustomerDAOImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO cobj = (CustomerDAO)context.getBean("customerDAOImpl");
		
		Customer customer = new Customer(1,"abc");
		int ans = cobj.addCustomer(customer);
		if(ans>0) System.out.println("Record added successfully");
		else System.out.println("Record not added.");

		customer.setCustomerName("bcd");
		int ans2 = cobj.updateCustomer(customer);
		if(ans2>0) System.out.println("Record updated successfully");
		else System.out.println("Record not updated.");
		
		int ans3 = cobj.deleteCustomer(customer);
		if(ans3>0) System.out.println("Record deleted successfully");
		else System.out.println("Record not deleted.");
	}

}
