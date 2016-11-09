package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JavaManager implements ApplicationContextAware{
	ApplicationContext ctx=null;
	public void addBatch(Batch bat){
		ctx.publishEvent(new BatchEvent(this,bat));
	}
	public void addWorkshop(Workshop ws){
		ctx.publishEvent(new WorkShopEvent(this,ws));
	}
	public void setApplicationContext(ApplicationContext ctx){
		this.ctx=ctx;
	}
	
}
