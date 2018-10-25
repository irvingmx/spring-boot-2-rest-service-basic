package com.springboot.rest.example;

public class StudentNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1384797929834234734L;

	public StudentNotFoundException(String message) {
		super(message);
	}

}
