package com.spring;
import javax.annotation.Resource;
public class A {
	@Resource(name="hello1")
	Hello hello1;
	@Resource(name="hello2")
	Hello hello2;
	@Resource
	Hai hai;
	void m1(){
		System.out.println("A-m1()");
		hello1.show();
		hello2.show();
		hai.show();
	}
}
