package com.satellite.util;

public class Queries {

	public static final String REGISTERUSERQUERY = 
			"insert into users(Name, Username, Password, ConfirmPassword) values(?, ?, ?, ?)";
	public static final String LOGINUSERQUERY = 
			"select * from users where Username=? and Password=?";
	public static final String ALLCOMMUNICATIONSATQUERY = 
			"select * from communication_satellites";
	public static final String ALLEARTHOBSERVATIONSATQUERY = 
			"select * from earth_observation_satellites";
	public static final String ALLEXPERIMENTALSATQUERY = 
			"select * from experimental_satellites";
	public static final String ALLSMALLSATQUERY = 
			"select * from small_satellites";
	public static final String ALLSTUDENTSATQUERY = 
			"select * from student_satellites";
	
	public static final String INSERTCOMMUNICATIONSATQUERY = 
			"insert into communication_satellites(ID, Name, LaunchDate, LaunchVehicle, Application, Year)"
			+ "values(?, ?, ?, ?, ?, ?)";
	
	public static final String COMMUNICATIONSATSEARCHBYYEARQUERY = 
			"select * from communication_satellites where Year=?";
	public static final String EARTHOBSERVATIONSATSEARCHBYYEARQUERY = 
			"select * from earth_observation_satellites where Year=?";
	public static final String EXPERIMENTALSATSEARCHBYYEARQUERY = 
			"select * from experimental_satellites where Year=?";
	public static final String SMALLSATSEARCHBYYEARQUERY = 
			"select * from small_satellites where Year=?";
	public static final String STUDENTSATSEARCHBYYEARQUERY = 
			"select * from student_satellites where Year=?";
	

}
