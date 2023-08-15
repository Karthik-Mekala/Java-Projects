package com.satellite.service;

import java.util.List;

import com.satellite.model.Satellite;
import com.satellite.model.SpaceApp;

public interface ISpaceAppService {
	public String userRegistration(SpaceApp spaceApp);
	public String userLogin(String username, String password);
	public List<Satellite> getAllCommunicationSat();	
	public List<Satellite> getAllEarthObservationSat();
	public List<Satellite> getAllExperimentalSat();
	public List<Satellite> getAllSmallSat();
	public List<Satellite> getAllStudentSat();
	public List<Satellite> communicationSatByYear(int year);
	public List<Satellite> earthObseravtionSatByYear(int year);
	public List<Satellite> experimentalSatByYear(int year);
	public List<Satellite> smallSatByYear(int year);
	public List<Satellite> studentSatByYear(int year);
}
