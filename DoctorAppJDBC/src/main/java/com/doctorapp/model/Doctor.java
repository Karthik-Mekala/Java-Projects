package com.doctorapp.model;

public class Doctor {
	private String doctorName;
	private Integer doctorId; // only primary key should be Integer
	private String speciality;
	private double fees;
	private int experience;
	public Doctor() {
		super();
	}
	public Doctor(String doctorName, String speciality, int experience, double fees) {
		super();
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.experience = experience;
		this.fees = fees;
	}
	public Doctor(String doctorName, Integer doctorId, String speciality, int experience, double fees) {
		super();
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.speciality = speciality;
		this.experience = experience;
		this.fees = fees;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", speciality=" + speciality + ", fees="
				+ fees + ", experience=" + experience + "]";
	}
	
	
	
}
