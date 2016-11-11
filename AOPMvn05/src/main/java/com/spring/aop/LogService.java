package com.spring.aop;

public class LogService {
	public void logParams(String p1,String p2){
		System.out.println("in LogParams:"+p1+" "+p2);
	}
	public void logReturnValue(Object msg){
		System.out.println("in LogReturnValue "+msg);
	}
	public void logExceptions(Exception ex){
		System.out.println("in LogExceptions "+ex);
	}
}
