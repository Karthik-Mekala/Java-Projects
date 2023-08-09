package com.doctorapp.exceptions;

@SuppressWarnings("serial")
public class DoctorNotFoundException extends RuntimeException {

	public DoctorNotFoundException() {
		super();
	}

	public DoctorNotFoundException(String message) {
		super(message);
	}
	
}
