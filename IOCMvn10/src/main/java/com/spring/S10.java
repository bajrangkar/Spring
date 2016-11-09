package com.spring;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class S10 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring Container Ready . . . .");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		ctx.registerShutdownHook();
		System.out.println("Spring Container Down . . . .");
		
		/*Resource rs = new ClassPathResource("spring.xml");
		Resource rs = new FileSystemResource("C:/Users/BK/Workspaces/MyEclipse for Spring 8.6/S10/src/spring.xml");
		 BeanFactory factory = new XmlBeanFactory(rs);
		 Hello h = (Hello)factory.getBean("hello");
		 h.show();
		*/
	}
}
