package com.spring.mvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController {
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		System.out.println("in HomeController");
		return new ModelAndView("index");
	}
	
}
