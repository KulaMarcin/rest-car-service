package kula.marcin.restcarservice.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CarRestExceptionHandler {
	
	
	@ExceptionHandler
	public ResponseEntity<CarErrorResponse> handleException (CarNotFoundException carNotFoundException) {
			
		CarErrorResponse carErrorResponse = new CarErrorResponse(HttpStatus.NOT_FOUND.value(), carNotFoundException.getMessage(), System.currentTimeMillis());		 
		
		return new ResponseEntity<>(carErrorResponse, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<CarErrorResponse> handleException (Exception exception) {
			
		CarErrorResponse carErrorResponse = new CarErrorResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis());		
		
		return new ResponseEntity<>(carErrorResponse, HttpStatus.BAD_REQUEST);
	}
}
