package org.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPL7 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		HelloService hello = ctx.getBean("hello", HelloService.class);
		hello.m1();
		System.out.println("--------");
		try{
			hello.m2();
		}catch(Exception e){}
		System.out.println("--------");
		hello.am1();
		System.out.println("--------");
		try{
			hello.am2();
		}catch(Exception e){}
		System.out.println("--------");
		hello.test();
		System.out.println("--------");
		HaiService hai = (HaiService)ctx.getBean("hai");
		hai.m1();
		System.out.println("--------");
		hai.m2();
		System.out.println("--------");
		hai.am1();
		System.out.println("--------");
		hai.am2();
		System.out.println("--------");
		hai.test1();
	}
}