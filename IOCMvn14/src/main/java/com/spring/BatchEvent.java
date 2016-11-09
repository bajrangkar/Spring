package com.spring;

import org.springframework.context.ApplicationEvent;
@SuppressWarnings("serial")
public class BatchEvent extends ApplicationEvent{
	Batch batch;
	public BatchEvent(Object source, Batch batch){
		super(source);
		this.batch=batch;
	}
	public Batch getBatch(){
		return batch;
	}
}
