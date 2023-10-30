package net.Bloodbank.BbApp.exception;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//import org.springframework.context.support.DefaultMessageSourceResolvable;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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

	@ExceptionHandler(DonorNotFoundException.class)
	public ResponseEntity<Map<String, List<String>>> handleNotFoundException(DonorNotFoundException ex) {
		List<String> errors = Collections.singletonList(ex.getMessage());
		return new ResponseEntity<>(getErrorsMap(errors), HttpStatus.NOT_FOUND);
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public class DonorNotFoundException extends RuntimeException {
		public DonorNotFoundException(String message) {
			super(message);
		}

		public DonorNotFoundException(String message, Throwable cause) {
			super(message, cause);
		}
	}

	@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<Map<String, List<String>>> handleRuntimeExceptions(RuntimeException ex) {
		List<String> errors = Collections.singletonList(ex.getMessage());
		return new ResponseEntity<>(getErrorsMap(errors), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
