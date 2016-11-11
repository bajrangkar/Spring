package com.spring.aop;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
public class JavaMBAdvice implements MethodBeforeAdvice{
	@Autowired
	LogService ls = null;
	@Autowired
	SecurityService ss = null;
	
	public void before(Method method,Object[] args, Object target){
		ss.verifyUser(args[0].toString(),args[1].toString());
		ls.logParams(args[0].toString(),args[1].toString());
	}
}	
