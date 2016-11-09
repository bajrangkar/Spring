package com.spring;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
public class A {
	@Autowired
	Hello hello;
	@Resource
	Hai hai;
	void m1(){
		System.out.println("A-m1()");
		hello.show();
		hai.show();
		System.out.println(hai==hello);
	}
}
