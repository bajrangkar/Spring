package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPa {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Using Target Object");
		CustomerService cs = (CustomerService)ctx.getBean("csTarget");
		cs.addCustomer();
		cs.updateCustomer();
		AccountService as = (AccountService)ctx.getBean("asTarget");
		as.mydeposit();
		try{
			as.mywithdraw();
		}catch(Exception e){
			System.out.println("Sorry ----");
		}
		System.out.println("-------------");
		System.out.println("-----Using Proxy Obejct-----");
		CustomerService cs1 = (CustomerService)ctx.getBean("csProxy");
		cs1.addCustomer();
		cs1.updateCustomer();
		AccountService as1 = (AccountService)ctx.getBean("asProxy");
		as1.mydeposit();
		as1.getBal();
		try{
			as1.mywithdraw();
		}catch(Exception e){
			System.out.println("Sorry ---------");
		}
	}
}
