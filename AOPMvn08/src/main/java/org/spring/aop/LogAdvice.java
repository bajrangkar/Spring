package org.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAdvice {
	@Pointcut("execution(* *.m*())")
	public void process(){}
	
	@Before("process() && args(p1,p2)")
	public void logParams(String p1,String p2){
		System.out.println("in logParams() : "+p1+" , "+p2);
		p1="aaaa";
		p2="bbbb";
		System.out.println("in logParams() : "+p1+" , "+p2);
	}
	@AfterReturning(value="process()",returning="msg")
	public void logReturnValue(Object msg){
		System.out.println("in logReturnValue"+msg);
	}
	@AfterThrowing(value="process()",throwing="ex")
	public void logExceptions(Exception ex){
		System.out.println("in logExceptions"+ex);
	}
	@After("process()")
	public void log(){
		System.out.println("in log");
	}
}
