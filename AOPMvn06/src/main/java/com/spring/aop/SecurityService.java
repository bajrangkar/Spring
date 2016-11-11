package com.spring.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class SecurityService {
	@Pointcut("execution(* com.spring.aop.*Service.m*())")
	public void prince(){}
	@Before("prince()")
	public void verifyUser(){
		System.out.println("SecurityService - verifyUser()");
	}
}
