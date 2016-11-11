package com.spring.aop;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LogService {
	@Pointcut("execution(* com.spring.aop.*Service.m*())")
	public void prince(){}
	@Before("prince()")
	public void logBegin(){
		System.out.println("LogService - logBegin()");
	}
	@AfterReturning("prince()")
	public void logEnd(){
		System.out.println("LogService - logEnd()");
	}
	@AfterThrowing("prince()")
	public void logException(){
		System.out.println("LogService - logException()");
	}
	@After("prince()")
	public void logOk(){
		System.out.println("LogService - logOk()");
	}
}
