package com.spring.mvc;

import javax.servlet.ServletException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
public class PostQueryController extends SimpleFormController {
	public ModelAndView onSubmit(Object command) throws ServletException{
		Query q = (Query) command;
		System.out.println(q.getMessage());
		return new ModelAndView("index");
	}
}
