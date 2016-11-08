package com.spring;

public class Hello {
	A aobj;
	B bobj;
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	void show(){
		aobj.show();
		bobj.show();
	}
}
