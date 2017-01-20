package com.spring.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ViewQueriesController extends AbstractController {
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		System.out.println("in ViewQueriesController");
		ArrayList<String> al=new ArrayList<String>();
		al.add("Spring Query 1");
		al.add("Spring Query 2");
		al.add("Spring Query 3");
		al.add("Spring Query 4");
		return new ModelAndView("viewQueries","list",al);
	}
	

}
