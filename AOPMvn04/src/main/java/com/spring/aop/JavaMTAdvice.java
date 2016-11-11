package com.spring.aop;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
public class JavaMTAdvice implements ThrowsAdvice{
	@Autowired
	LogService ls = null;
	public void afterThrowing(Exception e) throws Throwable{
		ls.logExceptions(e);
	}
}
