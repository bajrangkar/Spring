package com.spring;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S02 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Customer c = (Customer)ctx.getBean("cust");
		System.out.println(c.getCid()+"\n"+
				c.getCname()+"\n"+
				c.getEmails()+"\n"+
				c.getPhones()+"\n"+
				c.getRefs()+"\n"+
				c.getMyProperties()+"\n"+
				c.getAddress());
		Set<Order> orders = c.getOrders();
		for(Order o:orders)
			System.out.println(o);
	}
}
