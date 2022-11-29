package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public interface EmpApp {

	public static void main(String[] args) {
		//lazy loading
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("emp.xml"));
		System.out.println("BeanFactory loaded !!");
		factory.getBean("emp1");
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"emp2.xml","emp.xml"});
		System.out.println("Application context loaded !!");
		Employee e1 = (Employee)context.getBean("emp1");
		//Employee e2 = (Employee)context.getBean("emp2");
		System.out.println(e1);
		//System.out.println(e2);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
//		System.out.println("Application context loaded !!");
//		Employee e1 = (Employee)context.getBean("emp1");
//		System.out.println(e1);
	}
}
