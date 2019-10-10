package com.ustglobal.ustspringboot.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerClass {

	@ExceptionHandler(Exception.class)
	public String catchException(Exception e) {
		e.printStackTrace();
		return "handle Exception";
	}
}
