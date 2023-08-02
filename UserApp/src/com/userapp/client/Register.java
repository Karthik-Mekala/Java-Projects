package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) throws NameExistsException {
		IValidationService validationService = new ValidationServiceImpl();
		try {
			if (validationService.validateUsername("karthik669"))
				if (validationService.validatePassword("Karskja")) {
					System.out.println("Registered");
				}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Try again with different username.");
		}
	}

}
