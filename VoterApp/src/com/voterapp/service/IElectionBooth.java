package com.voterapp.service;

import com.voterapp.exceptions.InValidVoterException;
import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NoVoterIDException;

public interface IElectionBooth {
	boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException, LocalityNotFoundException, NoVoterIDException;
}
