package com.satellite.service;

import java.util.List;

import com.satellite.dao.ISpaceAppDao;
import com.satellite.dao.SpaceAppDaoImpl;
import com.satellite.exception.UserNotFoundException;
import com.satellite.model.Satellite;
import com.satellite.model.SpaceApp;

public class SpaceAppServiceImpl implements ISpaceAppService {

	ISpaceAppDao spaceAppDao = new SpaceAppDaoImpl();
	
	
	@Override
	public String userRegistration(SpaceApp spaceApp) {
		return spaceAppDao.userRegister(spaceApp);
	}

	@Override
	public String userLogin(String username, String password) {
		String name = spaceAppDao.userLogin(username, password);
		if(name == null)
			throw new UserNotFoundException();
		return name;
		
	}

	@Override
	public List<Satellite> getAllCommunicationSat() {
		List<Satellite> communicationSatList = spaceAppDao.getAllCommunicationSat();
		return communicationSatList;
	}

	@Override
	public List<Satellite> getAllEarthObservationSat() {
		List<Satellite> earthObservationSatList = spaceAppDao.getAllEarthObservationSat();
		return earthObservationSatList;
	}

	@Override
	public List<Satellite> getAllExperimentalSat() {
		List<Satellite> experimentalSatList = spaceAppDao.getAllExperimentalSat();
		return experimentalSatList;
	}

	@Override
	public List<Satellite> getAllSmallSat() {
		List<Satellite> smallSatList = spaceAppDao.getAllSmallSat();
		return smallSatList;
	}

	@Override
	public List<Satellite> getAllStudentSat() {
		List<Satellite> studentSatList = spaceAppDao.getAllStudentSat();
		return studentSatList;
	}

	@Override
	public List<Satellite> communicationSatByYear(int year) {
		List<Satellite> communicationSatList = spaceAppDao.communicationSatByYear(year);
		return communicationSatList;
	}

	@Override
	public List<Satellite> earthObseravtionSatByYear(int year) {
		List<Satellite> earthObservationSatList = spaceAppDao.earthObseravationSatByYear(year);
		return earthObservationSatList;
	}

	@Override
	public List<Satellite> experimentalSatByYear(int year) {
		List<Satellite> experimentalSatList = spaceAppDao.experimentalSatByYear(year);
		return experimentalSatList;
	}

	@Override
	public List<Satellite> smallSatByYear(int year) {
		List<Satellite> smallSatList = spaceAppDao.smallSatByYear(year);
		return smallSatList;
	}

	@Override
	public List<Satellite> studentSatByYear(int year) {
		List<Satellite> studentSatList = spaceAppDao.studentSatByYear(year);
		return studentSatList;
	}
}
