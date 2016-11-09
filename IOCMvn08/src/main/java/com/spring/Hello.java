package com.spring;

public class Hello {
	int a;
	String str;
	public Hello() {
		System.out.println("Hello O arg Cons");
	}
	public void setA(int a) {
		System.out.println("SetA()");;
		this.a = a;
	}
	public void setStr(String str) {
		System.out.println("SetStr()");
		this.str = str;
	}
	void show(){
		System.out.println(a);
		System.out.println(str);
	}
}