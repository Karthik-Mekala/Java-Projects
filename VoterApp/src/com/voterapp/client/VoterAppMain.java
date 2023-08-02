package com.voterapp.client;
import java.util.Scanner;

import com.voterapp.exceptions.InValidVoterException;
import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NoVoterIDException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class VoterAppMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = scanner.nextInt();
		System.out.print("Enter your Locality : ");
		String locality = scanner.next();
		System.out.print("Enter your Voter ID : ");
		int voterId = scanner.nextInt();
		
		IElectionBooth electionBooth = new ElectionBoothImpl();
		try {
			if(electionBooth.checkEligibility(age, locality, voterId)) {
				System.out.println("You are ready to avail your vote. Now you can Vote.");
			}
		} catch (InValidVoterException | LocalityNotFoundException | NoVoterIDException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}

}
