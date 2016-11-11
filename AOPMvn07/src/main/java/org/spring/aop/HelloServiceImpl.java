package org.spring.aop;

public class HelloServiceImpl implements HelloService {
	public void m1(){
		System.out.println("Hello Implementation - m1()");
	}
	public void m2() throws Exception{
		System.out.println("Hello Implementation - m2()");
		throw new Exception();
	}
	public void am1(){
		System.out.println("Hello Implementation - am1()");
	}
	public void am2() throws Exception{
		System.out.println("Hello Implementation - am2()");
		throw new Exception();
	}
	public void test(){
		System.out.println("Hello Implementation - test()");
	}
}
