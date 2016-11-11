package org.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class SecurityAdvice {
	public String verifyUser(ProceedingJoinPoint pjp,String p1,String p2) throws Throwable{
		System.out.println("in verifyUser() : "+p1+" , "+p2);
		System.out.println("Before Proceed()");
		Object o = pjp.proceed(new Object[]{p1,p2});
		System.out.println("After Proceed()");
		return o.toString();
	}
}
