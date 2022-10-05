package com.kundan.LearnToday.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.kundan.LearnToday.exceptions.DataNotFoundException;
import com.kundan.LearnToday.exceptions.DataNotSavedexception;

@RestControllerAdvice
public class ExceptionHandlerControler {
	
	@ExceptionHandler(value = DataNotFoundException.class)   
	public ResponseEntity<String> handleDataNotFoundException(Exception ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

}

	@ExceptionHandler(value = DataNotSavedexception.class)   
	public ResponseEntity<String> handleDataNotSavedexception(Exception ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);

}
	
	
}