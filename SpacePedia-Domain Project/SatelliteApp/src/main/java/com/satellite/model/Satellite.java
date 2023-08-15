package com.satellite.model;

import java.util.Date;

public class Satellite {
	private  int Id;
	private  String name;
	private  Date launchDate;
	private  String launchVehicle;
	private  String orbitType;
	private  String application;
	private  int year;
	
	public Satellite() {
		super();
	}
	public Satellite(int id, String name, Date launchDate, String launchVehicle, String orbitType, String application, int year) {
		super();
		Id = id;
		this.name = name;
		this.launchDate = launchDate;
		this.launchVehicle = launchVehicle;
		this.orbitType = orbitType;
		this.application = application;
		this.year = year;
	}
	public Satellite(int id, String name, Date launchDate, String launchVehicle, String orbitType, int year) {
		super();
		Id = id;
		this.name = name;
		this.launchDate = launchDate;
		this.launchVehicle = launchVehicle;
		this.orbitType = orbitType;
		this.year = year;
	}
	public Satellite(int id, String name, String launchVehicle, Date launchDate, int year, String application) {
		super();
		Id = id;
		this.name = name;
		this.launchVehicle = launchVehicle;
		this.launchDate = launchDate;
		this.application = application;
		this.year = year;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}
	public String getLaunchVehicle() {
		return launchVehicle;
	}
	public void setLaunchVehicle(String launchVehicle) {
		this.launchVehicle = launchVehicle;
	}
	public String getOrbitType() {
		return orbitType;
	}
	public void setOrbitType(String orbitType) {
		this.orbitType = orbitType;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Satellite [Id=" + Id + ", name=" + name + ", launchDate=" + launchDate + ", launchVehicle="
				+ launchVehicle + ", orbitType=" + orbitType + ", application=" + application + ", year=" + year + "]";
	}
	
}
