package com.spring.mvc;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
public class QueryValidator implements Validator {
	public boolean supports(Class clazz){
		return Query.class.equals(clazz);
	}
	public void validate(Object obj,Errors errors){
		//Query q = (Query)obj;
		ValidationUtils.rejectIfEmpty(errors,"message","errors.message");
	}
}
