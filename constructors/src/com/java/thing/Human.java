package com.java.thing;

public class Human {
	public String name;
	public String gender;
	public int noOfhumans;
	public int kidney;
	public double brainCC;
	public boolean motive;
	public int legs;
	public double birthDate;
	public long birthYear;
	public boolean alive;
	
	public Human() {
		System.out.println("starts from name");
	}
	
	public Human(String name) {
		this.name=name;
	}
	public Human(String name,String gender) {
		this.name=name;
		this.gender=gender;
	}
	public Human(int noOfhumans) {
		this.noOfhumans=noOfhumans;
	}
	public Human(int kidney,float brainCC) {
		this.kidney=kidney;
		this.brainCC=brainCC;
	}
	public Human(boolean alive) {
		this.alive=alive;
	}
	
	public void init(String name,String gender,int noOfhumans,int kidney,float brainCC,boolean motive,int legs,double birthDate,long birthYear,boolean alive) {
		this.name=name;
		this.gender=gender;
		this.noOfhumans=noOfhumans;
		this.kidney=kidney;
		this.brainCC=brainCC;
		this.motive=motive;
		this.legs=legs;
		this.birthDate=birthDate;
		this.birthYear=birthYear;
		this.alive=alive;
	}
	
	public void display() {
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.noOfhumans);
		System.out.println(this.kidney);
		System.out.println(this.brainCC);
		System.out.println(this.motive);
		System.out.println(this.legs);
		System.out.println(this.birthDate);
		System.out.println(this.birthYear);
		System.out.println(this.alive);
		
	}

}
