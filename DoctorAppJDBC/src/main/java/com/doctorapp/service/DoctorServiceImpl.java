package com.doctorapp.service;

import java.util.List;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService {

	IDoctorDao doctorDao = new DoctorDaoImpl();
	
	@Override
	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors = doctorDao.findAllDoctors();
		if(doctors.isEmpty())
			throw new DoctorNotFoundException("Sorry, No Doctor is available");
		return doctors;
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		if(doctorDao.updateDoctor(doctorId, fees) == 0)
			throw new DoctorNotFoundException("Sorry, Doctor with Doctor ID \"" + doctorId + "\" is not available");
		return doctorDao.updateDoctor(doctorId, fees);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorDao.deleteDoctor(doctorId);
	}

	@Override
	public Doctor getById(int doctorId) {
		if(doctorDao.findById(doctorId) == null)
			throw new DoctorNotFoundException("Sorry, Doctor with Doctor ID \"" + doctorId + "\" is not available");
		return doctorDao.findById(doctorId);
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		if(doctorDao.findBySpeciality(speciality).isEmpty())
			throw new DoctorNotFoundException("Sorry, Doctor with Speciality \"" + speciality + "\" is not available");
		return doctorDao.findBySpeciality(speciality);
		
	}

	@Override
	public List<Doctor> getBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException {
		if(doctorDao.findBySpecialityAndExperience(speciality, experience).isEmpty())
			throw new DoctorNotFoundException("Sorry, Doctor with Speciality \"" + speciality + "\" and having Experience \""+ experience +"\" years is not available");
		return doctorDao.findBySpecialityAndExperience(speciality, experience);
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		if(doctorDao.findBySpecialityAndFees(speciality, fees).isEmpty())
			throw new DoctorNotFoundException("Sorry, Doctor with Speciality \"" + speciality + "\" and having Fee \""+ fees +"\" is not available");
		return doctorDao.findBySpecialityAndFees(speciality, fees);
	}

}
