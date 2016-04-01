package com.example;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class GreetingValidator implements Validator {
	

	@Override
	public boolean supports(Class<?> type) {
		return type == Greeting.class;
	}

	@Override
	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "id", "", "id is empty");
		ValidationUtils.rejectIfEmpty(errors, "content", "", "Content is empty");
		
	}

}
