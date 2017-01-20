package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class ChangePasswordController extends AbstractController {
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("in ChangePasswordController");
		String msg = "Your Password has been changed.";
		return new ModelAndView("cpstatus", "msg", msg);
	}
}
