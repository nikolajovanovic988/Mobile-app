package com.appsdeveloperblog.ws.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.appsdeveloperblog.ws.model.response.ErrorMessage;

@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleAnyException(Exception e, WebRequest request) {

		String errorMessageDiscription = e.getLocalizedMessage();

		if (errorMessageDiscription == null)
			errorMessageDiscription = e.toString();

		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDiscription);

		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { NullPointerException.class, UserServiceException.class })
	public ResponseEntity<Object> handleSpecificExceptions(Exception e, WebRequest request) {

		String errorMessageDiscription = e.getLocalizedMessage();

		if (errorMessageDiscription == null)
			errorMessageDiscription = e.toString();

		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDiscription);

		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
