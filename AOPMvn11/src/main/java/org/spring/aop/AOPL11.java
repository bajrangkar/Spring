package org.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPL11 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloService hello = (HelloService)context.getBean("hello");
		
		hello.m1("sri", "fri");
		try{
			hello.m2("java1","java2");
		}catch(Exception e){
			hello.am1("Dough","Tough");
			hello.am2("Through","Thorough");
		}
	}

}
