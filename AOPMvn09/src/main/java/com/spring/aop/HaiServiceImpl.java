package com.spring.aop;

public class HaiServiceImpl implements HaiService{
	public void m1(){
		System.out.println("HaiService - m1()");
	}
	public void m2(){
		System.out.println("HaiService - m2()");
	}
	public void am1(){
		System.out.println("HaiService - am1()");
	}
	public void am2(){
		System.out.println("HaiService - am2()");
	}
	public void test1(){
		System.out.println("HaiService - test1()");
	}
}
