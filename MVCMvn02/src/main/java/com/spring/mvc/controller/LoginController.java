package com.spring.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.spring.mvc.command.User;

//SimpleFormController is not there in Spring4
public class LoginController extends SimpleFormController {
	public ModelAndView onSubmit(Object command,HttpSession s) throws ServletException{
		User user = (User)command;
		String un = user.getUsername();
		String pw = user.getPassword();
		System.out.println(un);
		System.out.println(pw);
		
		return new ModelAndView("home");
	}
	public Object formBackingObject(HttpServletRequest request) throws ServletException {
		User user = new User();
		user.setUsername("Googling Vivek");
		return user;
	}
}
