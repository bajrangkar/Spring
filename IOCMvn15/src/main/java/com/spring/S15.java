package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S15 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student stu=(Student)ctx.getBean("student");
		System.out.println(stu.getSid().getBid()+"\n"+
				stu.getSid().getSid()+"\n"+
				stu.getSname()+"\n"+
				stu.getPhone()+"\n"+
				stu.getFee().getFeeBal()+"\n"+
				stu.getFee().getFeepaid()+"\n"+
				stu.getFee().getTotalFee()+"\n"+
				stu.getEmails()+"\n"+
				stu.getPhones());
	}
}
