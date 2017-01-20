package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.command.Student;

public class RegisterWizardController extends AbstractWizardFormController {
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception{
		System.out.println("processCancel");
		return new ModelAndView(new RedirectView("register1.jsp"));
	}
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception{
		System.out.println("processFinish");
		return new ModelAndView(new RedirectView("registerFinal.jsp"));
	}
	protected void validatePage(Object command, Errors errors, int page) {
		Student stu = (Student)command;
		switch(page){
		case 0 :
			if(stu.getStudentID()==null||stu.getStudentID().length()==0){
				errors.rejectValue("studentID","errors.studentID",new Object[]{},"StudentID is Required");
			}
			if(stu.getFname()==null||stu.getFname().length()==0){
				errors.rejectValue("fname","errors.fname",new Object[]{},"First Name is Required");
			}
			if(stu.getLname()==null||stu.getLname().length()==0){
				errors.rejectValue("lname","errors.lname",new Object[]{},"Last Name is Required");
			}
			break;
		case 1 :
			if(stu.getEmail()==null||stu.getEmail().length()==0){
				errors.rejectValue("email","errors.email",new Object[]{},"Email is Required");
			}
			else if(!((stu.getEmail().contains("@"))&&(
					stu.getEmail().endsWith(".com")||
					stu.getEmail().endsWith(".co.in")||
					stu.getEmail().endsWith(".in")))){
				errors.rejectValue("email","errors.email",new Object[]{},"Invalid Email");
			}
			if(stu.getPhone()==null||stu.getPhone().length()==0){
				errors.rejectValue("phone","errors.phone",new Object[]{},"Phone is Required");
			}
			else if(stu.getPhone().length()!=10){
				errors.rejectValue("phone","errors.phone",new Object[]{},"Phone contains 10 digits");
			}
			else if(stu.getPhone().length()==10){
				try{
					Long.parseLong(stu.getPhone());
				}catch(Exception e){
					errors.rejectValue("phone","errors.phone",new Object[]{},"Phone contains only digits");
				}
			}
			if(stu.getTimings().length<1){
				errors.rejectValue("timings","errors.timings",new Object[]{},"Select Suitable Timings.");
			}
			break;
		case 2 :
			if(stu.getGender()==null||stu.getGender().length()==0){
				errors.rejectValue("gender","errors.gender",new Object[]{},"Gender is Required");
			}
			if(stu.getQualification()==null||stu.getQualification().length()==0||
					stu.getQualification().equals("-----Select Qualification-----")){
				errors.rejectValue("qualification","errors.qualification",new Object[]{},"Select Qualification");
			}
		}
	}
}
