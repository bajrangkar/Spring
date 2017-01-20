package com.spring.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.mvc.command.Student;

public class RegisterFormValidator implements Validator {
	public boolean supports(Class clazz){
		return Student.class.equals(clazz);
	}
	public void validate(Object obj,Errors errors){
		Student stu = (Student)obj;
		if(stu.getName()==null||stu.getName().length()==0){
			errors.rejectValue("name","errors.name",new Object[]{},"Name is Required");
		}
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
		if(stu.getGender()==null||stu.getGender().length()==0){
			errors.rejectValue("gender","errors.gender",new Object[]{},"Gender is Required");
		}
		if(stu.getQualification()==null||stu.getQualification().length()==0||
				stu.getQualification().equals("-----Select Qualification-----")){
			errors.rejectValue("qualification","errors.qualification",new Object[]{},"Select Qualification");
		}					
	}
}
