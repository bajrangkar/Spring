package com.spring.aop;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Autowired;
public class JavaMRAdvice implements AfterReturningAdvice{
	@Autowired
	LogService ls = null;
	@Autowired
	TxService ts = null;
	
	public void afterReturning(Object rv, Method method, Object[] args, Object target) throws Exception{
		ts.commit();
		ls.logReturning();
	}
}
