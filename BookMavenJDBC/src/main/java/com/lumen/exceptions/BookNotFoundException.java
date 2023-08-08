package com.lumen.exceptions;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception {

	public BookNotFoundException() {
		super();
	}

	public BookNotFoundException(String message) {
		super(message);
	}
	
}
