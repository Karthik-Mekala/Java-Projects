package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DBConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);	) {
			statement.setString(1, doctor.getDoctorName());
			statement.setString(2, doctor.getSpeciality());
			statement.setInt(3, doctor.getExperience());
			statement.setDouble(4, doctor.getFees());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Doctor> findAllDoctors() {
		List<Doctor> doctors = new ArrayList<Doctor>();
		Doctor doctor;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERY);
				ResultSet resultSet = preparedStatement.executeQuery();){
			while(resultSet.next()) {
				String doctorName = resultSet.getString("doctorName");
				Integer doctorId = resultSet.getInt("doctorId");
				String speciality = resultSet.getString("speciality");
				int experience = resultSet.getInt("experience");
				double fees = resultSet.getFloat("fees");
				doctor = new Doctor(doctorName, doctorId, speciality, experience, fees);
				doctors.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctors;
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		int result = 0;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);	) {
			statement.setDouble(1, fees);
			statement.setInt(2, doctorId);
			result = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		@SuppressWarnings("unused")
		int result = 0;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);	) {
			statement.setInt(1, doctorId);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Doctor findById(int doctorId) {
		Doctor doctor = null;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYID);) {
			statement.setInt(1, doctorId);
			ResultSet resultSet = statement.executeQuery();
				while(resultSet.next()) {
					String doctorName = resultSet.getString("doctorName");
					Integer doctorId1 = resultSet.getInt("doctorId");
					String speciality = resultSet.getString("speciality");
					int experience = resultSet.getInt("experience");
					double fees = resultSet.getFloat("fees");
					doctor = new Doctor(doctorName, doctorId1, speciality, experience, fees);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctor;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors = new ArrayList<Doctor>();
		Doctor doctor;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYSPECIALITY);){
			preparedStatement.setString(1, speciality);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName = resultSet.getString("doctorName");
				Integer doctorId = resultSet.getInt("doctorId");
				String speciality1 = resultSet.getString("speciality");
				int experience = resultSet.getInt("experience");
				double fees = resultSet.getFloat("fees");
				doctor = new Doctor(doctorName, doctorId, speciality1, experience, fees);
				doctors.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctors = new ArrayList<Doctor>();
		Doctor doctor;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYSPECIALITYEXP);){
			preparedStatement.setString(1, speciality);
			preparedStatement.setInt(2, experience);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName = resultSet.getString("doctorName");
				Integer doctorId = resultSet.getInt("doctorId");
				String speciality1 = resultSet.getString("speciality");
				int experience1 = resultSet.getInt("experience");
				double fees = resultSet.getFloat("fees");
				doctor = new Doctor(doctorName, doctorId, speciality1, experience1, fees);
				doctors.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctors = new ArrayList<Doctor>();
		Doctor doctor;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYSPECIALITYFEES);){
			preparedStatement.setString(1, speciality);
			preparedStatement.setDouble(2, fees);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName = resultSet.getString("doctorName");
				Integer doctorId = resultSet.getInt("doctorId");
				String speciality1 = resultSet.getString("speciality");
				int experience1 = resultSet.getInt("experience");
				double fees1 = resultSet.getFloat("fees");
				doctor = new Doctor(doctorName, doctorId, speciality1, experience1, fees1);
				doctors.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctors;
	}

}
