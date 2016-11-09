package com.spring;

public class Hello {
	private A aobj = null;
	private B bobj = null;
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	void m1(){
		aobj.showA();
		bobj.showB();
	}
}
