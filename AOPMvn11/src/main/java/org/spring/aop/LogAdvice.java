package org.spring.aop;
public class LogAdvice {
	public void logParams(String p1,String p2){
		System.out.println("in logParams() : "+p1+" , "+p2);
		p1="aaaa";
		p2="bbbb";
		System.out.println("in logParams() : "+p1+" , "+p2);
	}
	public void logReturnValue(Object msg){
		System.out.println("in logReturnValue"+msg);
	}
	public void logExceptions(Exception ex){
		System.out.println("in logExceptions"+ex);
	}
	public void log(){
		System.out.println("in log");
	}
}
