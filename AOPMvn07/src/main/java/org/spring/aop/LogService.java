package org.spring.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LogService {
	@Pointcut(value="execution(* org.spring.aop.*.m*())")
	public void process(){}
	
	@Around("process()")
	public void log(ProceedingJoinPoint pjp) throws Throwable{
		logBegin();
		pjp.proceed();
		logEnd();
	}
	public void logBegin(){
		System.out.println("LogService - LogBegin()");
	}
	public void logEnd(){
		System.out.println("LogService - LogEnd()");
	}
	@AfterThrowing("process()")
	public void logException(){
		System.out.println("LogService - LogException()");
	}
	@After("process()")
	public void logOk(){
		System.out.println("LogService - LogOk()");
	}
}
