package com.spring.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AOPd {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Using Target Object");
		CustomerService cs = (CustomerService)ctx.getBean("csTarget");
		cs.addCustomer();
		cs.updateCustomer();
		AccountService as = (AccountService)ctx.getBean("asTarget");
		as.mydeposit();
		as.getBal();
		try{
			as.mywithdraw();
		}catch(Exception e){
			System.out.println("Sorry ----");
		}
	}
}
