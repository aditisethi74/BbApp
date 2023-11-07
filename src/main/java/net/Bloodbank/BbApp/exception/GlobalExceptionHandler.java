package net.Bloodbank.BbApp.exception;

import java.sql.Date;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//import org.springframework.context.support.DefaultMessageSourceResolvable;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, List<String>>> handleValidationErrors(MethodArgumentNotValidException ex) {
		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage)
				.collect(Collectors.toList());
		return new ResponseEntity<>(getErrorsMap(errors), HttpStatus.BAD_REQUEST);
	}

	private Map<String, List<String>> getErrorsMap(List<String> errors) {
		Map<String, List<String>> errorResponse = new HashMap<>();
		errorResponse.put("errors", errors);
		return errorResponse;
	}
	
	/*@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgsNotValidException(MethodArgumentNotValidException ex) {
	Map<String,String>resp=new HashMap<>();
	ex.getBindingResult().getAllErrors().forEach((error)->{
		String fieldName=((FieldError)error).getField();
		String message=error.getDefaultMessage();
		resp.put(fieldName, message);
		});
		return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
	}*/
	
	
	

	/*@ExceptionHandler(DonorNotFoundException.class)
	public ResponseEntity<String> handleNotFoundException(DonorNotFoundException exception , WebRequest request  ) {
		 ErrorsDetails errorsDetails = new ErrorsDetails(  exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public class DonorNotFoundException extends RuntimeException {
		public DonorNotFoundException(String message) {
			super(message);
		}

		public DonorNotFoundException(String message, Throwable cause) {
			super(message, cause);
		}
	}*/
	
	
	/*public class ErrorController {
	    @ExceptionHandler(HttpMessageNotReadableException.class)
	    public ResponseEntity<String> handleException(HttpMessageNotReadableException exception, HttpServletRequest request) {
	        return new ResponseEntity<String>("You gave an incorrect value for ....", HttpStatus.BAD_REQUEST);
	    }
	}*/
	
	@ExceptionHandler(DonorNotFoundException.class)
	public ResponseEntity<ApiError> handlesNotFoundException(DonorNotFoundException ex){
		String message=ex.getMessage();
		ApiError apiError=new ApiError(message, false);
		return new ResponseEntity<ApiError>(apiError,HttpStatus.NOT_FOUND);
	}

	/*@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<Map<String, List<String>>> handleRuntimeExceptions(RuntimeException ex) {
		List<String> errors = Collections.singletonList(ex.getMessage());
		
		
		return new ResponseEntity<>(getErrorsMap(errors), HttpStatus.BAD_REQUEST);
	}*/

}
