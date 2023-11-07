package net.Bloodbank.BbApp.exception;

import org.springframework.stereotype.Component;

//@Component
public class ErrorsDetails {
	
	private String message;
	private String details;
	
	public ErrorsDetails() {
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public ErrorsDetails( String message, String details) {
		super();
		
		this.message = message;
		this.details = details;
	}
	

}
