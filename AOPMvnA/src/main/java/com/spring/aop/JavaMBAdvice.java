package com.spring.aop;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
public class JavaMBAdvice implements MethodBeforeAdvice{
	@Autowired
	LogService ls = null;
	@Autowired
	SecurityService ss = null;
	@Autowired
	TxService ts = null;
	
	public void before(Method method,Object[] args, Object target) throws Exception{
		ss.verifyUser();
		ls.logBefore();
		ts.begin();
	}
}	
