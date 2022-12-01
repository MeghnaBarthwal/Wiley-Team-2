package com.anno.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.anno.*")
public class CustomerConfiguration {

	@Bean(name = "customer123")
	public Customer myCustomer() {
		Customer c = new Customer();
		c.setCustomerId(102);
		c.setCustomerName("aditi");
		return c;
	}
}
