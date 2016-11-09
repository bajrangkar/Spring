package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
public class S11 {
	public static void main(String[] args) {
		//Resource rs = new ClassPathResource("spring.xml");
		Resource rs = new FileSystemResource("E:/[00] Platform to learn/workspace/_Spring/IOCMvn11/src/main/java/spring.xml");
		 BeanFactory factory = new XmlBeanFactory(rs);
		 Hello h = (Hello)factory.getBean("hello");
		 h.show();
	}
}
