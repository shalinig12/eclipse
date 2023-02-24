package com.xworkz.exception.event;

public class Doctor extends Person {
	private String specialist;
	private String hospitalName;

	public Doctor() {
		System.out.println("no arg constructor in doctor");
	}

	public Doctor(int id, String name, String email, int age, String specialist, String hospitalName) {
		super(id, name, email, age);
		this.specialist = specialist;
		this.hospitalName = hospitalName;
		System.out.println("calling super chaining in doctor");
	}

	public Doctor(int id, String name, String email, int age) {
		super(id, name, email, age);

		System.out.println("calling super chaining in doctor");
	}

	public Doctor(int id, String name, String email) {
		super(id, name, email);

		System.out.println("calling super chaining in doctor");
	}

	public Doctor(int id, String name) {
		super(id, name);

		System.out.println("calling super chaining in doctor");
	}
	
	public void setSpecialist(String specialist) {
		this.specialist=specialist;
		
	}
	
	public void setHospitalName(String hospitalName) {
		this.hospitalName=hospitalName;
		
	}
	
	public String getSpecialist() {
		return specialist;
	}
	
	public String getHospitalName() {
		return hospitalName;
	}
	
	

}
