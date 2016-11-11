package org.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityAdvice {
	@Pointcut("execution(* *.am*())")
	public void jeans(){}
	
	@Around("jeans() && args(p1,p2)")
	public String verifyUser(ProceedingJoinPoint pjp,String p1,String p2) throws Throwable{
		System.out.println("in verifyUser() : "+p1+" , "+p2);
		System.out.println("Before Proceed()");
		Object o = pjp.proceed(new Object[]{p1,p2});
		System.out.println("After Proceed()");
		return o.toString();
	}
	

}
