package com.spring.aop;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
public class JavaMIAdvice implements MethodInterceptor{
	@Autowired
	LogService ls = null;
	@Autowired
	SecurityService ss = null;
	
	public Object invoke(MethodInvocation mi) throws Throwable{
		ss.verifyUser();
		ls.logBegin();
		mi.proceed();
		ls.logEnd();
		return null;
	}
}	
