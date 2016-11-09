package com.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Hello implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{
	int x;
	String str;
	A aobj;
	@Autowired
	B bobj;
	String bname;
	BeanFactory factory;
	ApplicationContext context;
	@Autowired
	BeanFactory factory1;
	@Autowired
	ApplicationContext context1;
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
	public void setAobj(A aobj){
		System.out.println("setAobj()");
		this.aobj=aobj;
	}
	@PostConstruct
	public void init(){
		//Do initialization here
		System.out.println("init()");
	}
	public void afterPropertiesSet() throws Exception{
		//do initialization here
		System.out.println("afterProperiesSet()");
	}
	public void myInit(){
		//do initialization here
		System.out.println("myInit()");
	}
	@PreDestroy
	public void cleanup(){
		//do CleanUp here
		System.out.println("cleanup()");
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
	public void setApplicationContext(ApplicationContext context) throws BeansException{
		System.out.println("setApplicationContext()");
		this.context=context;
	}
	void show(){
		System.out.println(x);
		System.out.println(str);
		aobj.m1();
		bobj.m2();
		System.out.println(bname);
		System.out.println(factory);
		System.out.println(factory1);
		System.out.println(context);
		System.out.println(context1);
	}
}