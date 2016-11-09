package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostPro implements BeanPostProcessor{
	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException{
		System.out.println("postProcessAfterInitialization()....");
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException{
		System.out.println("postProcessBeforeInitialization()....");
		return bean;
	}
}
