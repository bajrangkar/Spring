package com.spring.mvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
public class ContactController extends MultiActionController {
	public ModelAndView addContact(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		System.out.println("in addContact() Method");
		return new ModelAndView("addContact");
	}
	public ModelAndView updateContact(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		System.out.println("in updateContact() Method");
		return new ModelAndView("updateContact");
	}
	public ModelAndView deleteContact(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		System.out.println("in deleteContact() Method");
		return new ModelAndView("deleteContact");
	}
	public ModelAndView viewContact(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		System.out.println("in viewContact() Method");
		return new ModelAndView("viewContact");
	}
}
