package com.sergio.backendninjas.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

	public static final String ERROR_501="error/generalError";
	
	@ExceptionHandler(Exception.class)
	public String error501(){
		
		return ERROR_501;
	}
}
