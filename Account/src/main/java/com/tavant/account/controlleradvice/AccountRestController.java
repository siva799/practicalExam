package com.tavant.account.controlleradvice;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.tavant.account.controller.errorresponse.ErrorResponse;
import com.tavant.account.exceptions.NoDataFoundException;



@ControllerAdvice
public class AccountRestController {
	
	//@ExceptionHandler(EmployeeNotFoundException.class)
	
		@ExceptionHandler(NoDataFoundException.class)
		public final ResponseEntity<ErrorResponse> 
		handleEmployeeNotFoundException(NoDataFoundException e,WebRequest request) {
			List<String> details = new ArrayList<String>();
			details.add(e.getLocalizedMessage());
			
			ErrorResponse errorResponse = new ErrorResponse("INCORRECT REQUEST",details);
			return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
		}

}