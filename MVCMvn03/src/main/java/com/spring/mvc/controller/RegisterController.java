package com.spring.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.spring.mvc.command.Student;

public class RegisterController extends SimpleFormController {
	public ModelAndView onSubmit(Object command,HttpSession s) throws ServletException{
		Student stu = (Student)command;
		System.out.println(stu.getStudentID());
		System.out.println(stu.getName());
		System.out.println(stu.getEmail());
		System.out.println(stu.getPhone());
		System.out.println(stu.getGender());
		System.out.println(stu.getQualification());
		String tim[] = stu.getTimings();
		for(int i=0;i<tim.length;i++){
			System.out.println(tim[i]);
		}
		System.out.println(stu.getRemarks());
		return new ModelAndView("home");
	}
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		Student stu = new Student();
		stu.setStudentID("JAVA-99");
		return stu;
	}
}
