package org.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {
	@Pointcut(value="execution(* org.spring.aop.*Service.m*())")
	public void proc(){}
	
	@Around("proc()")
	public void verifyUser(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("in VerifyUser()");
		System.out.println("Before Proceed()");
		pjp.proceed();
		System.out.println("After Procedd()");
	}
}
