package com.userapp.service;
import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
	String[] usernames = new String[] {"karthik6699", "viswa123", "niki6779"};
	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		for(String uname : usernames) {
			if(username.equals(uname))
				throw new NameExistsException("Name already exists");	
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongException, TooShortException {
		if(password.length() < 6)
			throw new TooShortException("Password is too short");
		else if(password.length() > 15)
			throw new TooLongException("Password is too Long");
		return true;
	}

}
