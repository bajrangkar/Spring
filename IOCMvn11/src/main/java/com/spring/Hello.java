package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware{
	int x;
	String str;
	String bname;
	BeanFactory factory;
	static{
		System.out.println("Hello - S.B");
	}
	Hello(){
		System.out.println("Hello - D.C");
	}
	Hello(int x){
		System.out.println("Hello - 1 arg");
		this.x=x;
	}
	public void setStr(String str){
		System.out.println("setStr()");
		this.str=str;
	}
	public void afterPropertiesSet() throws Exception{
		//do initialization here
		System.out.println("afterProperiesSet()");
	}
	public void myInit(){
		//do initialization here
		System.out.println("myInit()");
	}
	public void destroy() throws Exception{
		//do CleanUp here
		System.out.println("destroy()");
	}
	public void mycleanup(){
		//do CleanUp here
		System.out.println("mycleanup()");
	}
	
	public void setBeanName(String bname){
		System.out.println("setBeanName()");
		this.bname=bname;
	}
	public void setBeanFactory(BeanFactory factory) throws BeansException{
		System.out.println("setBeanFactory()");
		this.factory=factory;
	}
	void show(){
		System.out.println(x);
		System.out.println(str);
		System.out.println(bname);
		System.out.println(factory);
	}
}