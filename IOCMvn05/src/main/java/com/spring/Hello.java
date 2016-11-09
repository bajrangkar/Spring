package com.spring;

public class Hello {
	private Hai hai = null;
	private A aobj = null;
	public Hello() {
		System.out.println("Hello O arg Cons");;
	}
	public Hello(Hai hai, A aobj) {
		System.out.println("Hello 2 arg Cons");;
		this.hai = hai;
		this.aobj = aobj;
	}
	public Hello(A aobj) {
		System.out.println("Hello 1(A) arg Cons");;
		this.aobj = aobj;
	}
	public Hello(Hai hai) {
		System.out.println("Hello 1(Hai) arg Cons");;
		this.hai = hai;
	}
	public void setHai(Hai hai) {
		this.hai = hai;
	}
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	void m1(){
		hai.show();
		aobj.show();
	}
}
