package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class S07 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		A obj=(A)ctx.getBean("aobj");
		obj.m1();
		//B obj1=(B)ctx.getBean("bobj");
		//obj1.m1();
	}
}
