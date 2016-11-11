package org.spring.aop;

import java.sql.SQLException;

public class HelloService {
	public String m1(String p1,String p2){
		System.out.println("m1 : "+p1+" , "+p2);
		return "I am m1";
	}
	public String m2(String p1,String p2) throws Exception{
		System.out.println("m2 : "+p1+" , "+p2);
		if(1==1)
			throw new SQLException();
		return "I am m2";
	}
	public String am1(String p1,String p2){
		System.out.println("am1 : "+p1+" , "+p2);
		return "I am am1";
	}
	public String am2(String p1,String p2){
		System.out.println("am2 : "+p1+" , "+p2);
		return "I am am2";
	}

}
