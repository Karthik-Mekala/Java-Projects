package com.doctorapp.client;

import java.util.List;
import java.util.Scanner;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class DoctorMain {

	public static void main(String[] args) {
		IDoctorService doctorService = new DoctorServiceImpl();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hi there !");
		System.out.println("Welcome to my Doctor App");
		System.out.println();

		boolean option = true;
		while(option) {

			System.out.println("Select any Option");
			System.out.println("1. Add Doctor");
			System.out.println("2. Get All Doctors");
			System.out.println("3. Upadate Doctor");
			System.out.println("4. Delete Doctor");
			System.out.println("5. Get Doctor By ID");
			System.out.println("6. Get Doctor By Speciality");
			System.out.println("7. Get Doctor By Speciality and Experience");
			System.out.println("8. Get Doctor By Speciality and Fee");
			System.out.println();
			System.out.print("Enter your Choice : ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				// USER INPUT TO ADD DOCTOR INTO THE DATABASE
				System.out.println();
				System.out.print("Enter Doctor Name : ");
				String doctorName = scanner.nextLine();

				System.out.print("Enter Doctor Speciality : ");
				String speciality = scanner.nextLine();

				System.out.print("Enter Doctor Experience : ");
				Integer experience = scanner.nextInt();

				System.out.print("Enter Doctor Fee : ");
				double fees = scanner.nextDouble();

				System.out.println();
				Doctor doctor = new Doctor(doctorName, speciality, experience, fees);
				doctorService.addDoctor(doctor);
				System.out.println("Doctor added successfully.");
				break;

			case 2:
				// GET ALL DOCTORS
				System.out.println();
				System.out.println("All Doctors --> ");
				try {
					List<Doctor> doctors = doctorService.getAllDoctors();
					for(Doctor eachDoctor : doctors) {
						System.out.println("Doctor Name : " + eachDoctor.getDoctorName());
						System.out.println("Doctor ID : " + eachDoctor.getDoctorId());
						System.out.println("Doctor Speciality : " + eachDoctor.getSpeciality());
						System.out.println("Doctor Experience : " + eachDoctor.getExperience());
						System.out.println("Doctor Fee : " + eachDoctor.getFees());
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				// UPDATE DOCTOR FEE
				System.out.println();
				System.out.print("Enter Doctor ID : ");
				Integer doctorId = scanner.nextInt();

				System.out.print("Enter Doctor Fee : ");
				double doctorFee = scanner.nextDouble();
				try {
					System.out.println("\"" + doctorService.updateDoctor(doctorId, doctorFee) + "\" row updated.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				// DELETE DOCTOR
				System.out.println();
				System.out.print("Enter Book ID : ");
				int dotorId = scanner.nextInt();
				doctorService.deleteDoctor(dotorId);
				System.out.println("Doctor with ID \"" + dotorId + "\" deleted successfully ");
				break;

			case 5:
				// GET DOCTOR BY ID
				System.out.println();
				System.out.print("Enter Book ID : ");
				int dotorId1 = scanner.nextInt();
				System.out.println();
				System.out.println("Doctor by ID -->");
				try {
					Doctor doctor1 = doctorService.getById(dotorId1);
					System.out.println("Doctor Name : " + doctor1.getDoctorName());
					System.out.println("Doctor ID : " + doctor1.getDoctorId());
					System.out.println("Doctor Speciality : " + doctor1.getSpeciality());
					System.out.println("Doctor Experience : " + doctor1.getExperience());
					System.out.println("Doctor Fee : " + doctor1.getFees());
					System.out.println();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;


			case 6:
				// GET DOCTOR BY SPECIALITY
				System.out.print("Enter Doctor Speciality : ");
				String speciality1 = scanner.nextLine();
				System.out.println();
				System.out.println("Doctors by Speciality -->");
				try {
					List<Doctor> doctors =  doctorService.getBySpeciality(speciality1);
					for(Doctor eachDoctor : doctors) {
						System.out.println("Doctor Name : " + eachDoctor.getDoctorName());
						System.out.println("Doctor ID : " + eachDoctor.getDoctorId());
						System.out.println("Doctor Speciality : " + eachDoctor.getSpeciality());
						System.out.println("Doctor Experience : " + eachDoctor.getExperience());
						System.out.println("Doctor Fee : " + eachDoctor.getFees());
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 7:
				// GET DOCTOR BY SPECIALITY AND EXPERIENCE
				System.out.print("Enter Doctor Speciality : ");
				String speciality2 = scanner.nextLine();
				System.out.print("Enter Doctor Experience : ");
				Integer experience2 = scanner.nextInt();
				System.out.println();
				System.out.println("Doctors By Speciality and Experience -->");
				try {
					List<Doctor> doctors =  doctorService.getBySpecialityAndExperience(speciality2, experience2);
					for(Doctor eachDoctor : doctors) {
						System.out.println("Doctor Name : " + eachDoctor.getDoctorName());
						System.out.println("Doctor ID : " + eachDoctor.getDoctorId());
						System.out.println("Doctor Speciality : " + eachDoctor.getSpeciality());
						System.out.println("Doctor Experience : " + eachDoctor.getExperience());
						System.out.println("Doctor Fee : " + eachDoctor.getFees());
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 8:
				// GET DOCTOR BY SPECIALITY AND FEES
				System.out.print("Enter Doctor Speciality : ");
				String speciality3 = scanner.nextLine();
				System.out.print("Enter Doctor Fee : ");
				double fee3 = scanner.nextDouble();
				System.out.println();
				System.out.println("Doctors By Speciality and Fee -->");
				try {
					List<Doctor> doctors =  doctorService.getBySpecialityAndFees(speciality3, fee3);
					for(Doctor eachDoctor : doctors) {
						System.out.println("Doctor Name : " + eachDoctor.getDoctorName());
						System.out.println("Doctor ID : " + eachDoctor.getDoctorId());
						System.out.println("Doctor Speciality : " + eachDoctor.getSpeciality());
						System.out.println("Doctor Experience : " + eachDoctor.getExperience());
						System.out.println("Doctor Fee : " + eachDoctor.getFees());
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			default:
				System.out.println("Enter a valid choice");
				System.out.println();
				break;
			}
			System.out.println();
			System.out.print("Do you want to try again [y/n] : ");
			String tryAgain = scanner.next();
			if(tryAgain.equals("y"))
				option = true;
			else {
				option = false;
				System.out.println("Thank you!");
				break;
			}
			System.out.println();

		}
		scanner.close();

	}

}
