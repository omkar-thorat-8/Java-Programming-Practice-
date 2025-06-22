package com.ankit.TwoServicesConnection;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

	//@ExceptionHandler(value = {NullPointerException.class,ArithmeticException.class})
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handlerError(Exception e,WebRequest request) {
		
		String responseText = "We Have a Problem";
		
		return handleExceptionInternal(e, responseText, new HttpHeaders(), HttpStatus.OK,request);	
	}
	
}
