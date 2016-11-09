package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S14 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		JavaManager ma=(JavaManager)ctx.getBean("java");
		Batch b= new Batch("N-23","28-Apr-2010","6:30-8:30",150);
		ma.addBatch(b);
		Workshop ws = new Workshop("Web Services",5000,99);
		ma.addWorkshop(ws);
	}
}
