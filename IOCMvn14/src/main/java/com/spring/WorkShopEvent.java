package com.spring;
import org.springframework.context.ApplicationEvent;
@SuppressWarnings("serial")
public class WorkShopEvent extends ApplicationEvent{
	Workshop ws;
	public WorkShopEvent(Object source, Workshop ws){
		super(source);
		this.ws=ws;
	}
	public Workshop getWs(){
		return ws;
	}
}
