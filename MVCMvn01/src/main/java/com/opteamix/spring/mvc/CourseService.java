package com.opteamix.spring.mvc;

import java.util.ArrayList;

public class CourseService {
	public ArrayList<String> getCourses(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Jsp");
		al.add("Struts");
		al.add("Spring");
		al.add("EJB");
		al.add("JSF");
		return al;
	}
}
