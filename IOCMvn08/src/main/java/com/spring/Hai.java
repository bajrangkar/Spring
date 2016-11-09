package com.spring;

public class Hai {
	int x;
	String msg;
	public Hai(int x, String msg) {
		System.out.println("Hai - 2 args");
		this.x = x;
		this.msg = msg;
	}
	public void show(){
		System.out.println(x);
		System.out.println(msg);
	}
}
