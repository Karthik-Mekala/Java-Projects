package com.satellite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import com.satellite.exception.UserNotFoundException;
import com.satellite.model.Satellite;
import com.satellite.model.SpaceApp;
import com.satellite.util.DBConnection;
import com.satellite.util.Queries;

public class SpaceAppDaoImpl implements ISpaceAppDao{

	@Override
	public String userRegister(SpaceApp spaceApp) {
		String name = spaceApp.getName();
		String username = spaceApp.getUsername();
		String password = spaceApp.getPassword();
		String confirmPassword = spaceApp.getConfirmPassword();
		
		boolean isMatch = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")
	               .matcher(password)
	               .find();
		if(isMatch) {
			if(password.equals(confirmPassword)) {
				try(Connection connection = DBConnection.openConnection(); // get the connection
						PreparedStatement statement = connection.prepareStatement(Queries.REGISTERUSERQUERY);	) {
					statement.setString(1, name);
					statement.setString(2, username);
					statement.setString(3, password);
					statement.setString(4, confirmPassword);
					statement.execute();
					return "User Registered Successfully.";
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				return "Password and Confirm password should be same.";
				
			}
		} else {
			return "Password must contains at least 8 characters and at most 20 characters.<br>"
					+ "It contains at least one digit.<br>"
					+ "It contains at least one upper case alphabet.<br>"
					+ "It contains at least one lower case alphabet.<br>"
					+ "It contains at least one special character which includes !@#$%&*()-+=^.<br>"
					+ "It doesn’t contain any white space."; 
			
		}
		return null;
	}

	@Override
	public String userLogin(String username, String password) throws UserNotFoundException {
		String name = null;
		try(Connection connection = DBConnection.openConnection(); // get the connection
				PreparedStatement statement = connection.prepareStatement(Queries.LOGINUSERQUERY);	) {
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				name = resultSet.getString("Name");
			}
			return name;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}

	@Override
	public List<Satellite> getAllCommunicationSat() {
		List<Satellite> communicationSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.ALLCOMMUNICATIONSATQUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				Date launchDate = resultSet.getDate("LaunchDate");
				String application = resultSet.getString("Application");
				int year = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchVehicle, launchDate, year, application);
				communicationSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return communicationSatList;
	}

	@Override
	public List<Satellite> getAllEarthObservationSat() {
		List<Satellite> earthObservationSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.ALLEARTHOBSERVATIONSATQUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				int year = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, year);
				earthObservationSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return earthObservationSatList;
	}

	@Override
	public List<Satellite> getAllExperimentalSat() {
		List<Satellite> experimentalSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.ALLEXPERIMENTALSATQUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				int year = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, year);
				experimentalSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return experimentalSatList;
	}

	@Override
	public List<Satellite> getAllSmallSat() {
		List<Satellite> experimentalSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.ALLSMALLSATQUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				String application = resultSet.getString("Application");
				int year = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, application, year);
				experimentalSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return experimentalSatList;
	}

	@Override
	public List<Satellite> getAllStudentSat() {
		List<Satellite> experimentalSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.ALLSTUDENTSATQUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				int year = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, year);
				experimentalSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return experimentalSatList;
	}

	@Override
	public List<Satellite> communicationSatByYear(int year) {
		System.out.println(year);
		List<Satellite> communicationSatByYearList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.COMMUNICATIONSATSEARCHBYYEARQUERY);
			preparedStatement.setInt(1, year);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String application = resultSet.getString("Application");
				int year1 = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchVehicle, launchDate, year1, application);
				communicationSatByYearList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return communicationSatByYearList;
	}

	@Override
	public List<Satellite> earthObseravationSatByYear(int year) {
		List<Satellite> earthObservationSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.EARTHOBSERVATIONSATSEARCHBYYEARQUERY);
			preparedStatement.setInt(1, year);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				int year1 = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, year1);
				earthObservationSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return earthObservationSatList;
	}

	@Override
	public List<Satellite> experimentalSatByYear(int year) {
		List<Satellite> experimentalSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.EXPERIMENTALSATSEARCHBYYEARQUERY);
			preparedStatement.setInt(1, year);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				int year1 = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, year1);
				experimentalSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return experimentalSatList;
	}

	@Override
	public List<Satellite> smallSatByYear(int year) {
		List<Satellite> experimentalSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.SMALLSATSEARCHBYYEARQUERY);
			preparedStatement.setInt(1, year);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				String application = resultSet.getString("Application");
				int year1 = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, application, year1);
				experimentalSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return experimentalSatList;
	}

	@Override
	public List<Satellite> studentSatByYear(int year) {
		List<Satellite> experimentalSatList = new ArrayList<Satellite>();
		Satellite satellite;
		try{
			Connection connection = DBConnection.openConnection(); // get the connection
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.STUDENTSATSEARCHBYYEARQUERY);
			preparedStatement.setInt(1, year);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				Date launchDate = resultSet.getDate("LaunchDate");
				String launchVehicle = resultSet.getString("LaunchVehicle");
				String orbitType = resultSet.getString("OrbitType");
				int year1 = resultSet.getInt("Year");
				satellite = new Satellite(id, name, launchDate, launchVehicle, orbitType, year1);
				experimentalSatList.add(satellite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return experimentalSatList;
	}

	
}
