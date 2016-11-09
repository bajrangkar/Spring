package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	@Autowired
	Hello hello;
	@Autowired
	Hai hai;
	void m1(){
		System.out.println("A-m1()");
		hai.show();
		hello.show();
	}
}
