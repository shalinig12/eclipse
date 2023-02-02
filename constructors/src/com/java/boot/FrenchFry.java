package com.java.boot;

public class FrenchFry {
	public String name;
	public int types;
	public int carbs;
	public int protiens;
	public long expiryYear;
	public double expiryDate;
	public String brand;
	public String hotel;
	public int prize;
	public char shape;
	
	public FrenchFry(String arg1) {
		name=arg1;
		
	}
	public FrenchFry(int arg2) {
		types=arg2;
		
	}
	public FrenchFry(long arg3) {
		expiryYear=arg3;
		
	}
	public FrenchFry(double arg3) {
		expiryDate=arg3;
		
	}
	public FrenchFry(String arg1, int arg4) {
		name=arg1;
		carbs=arg4;
		
	}
	public FrenchFry(String arg1,double arg4) {
		name=arg1;
		expiryDate=arg4;
		
	}
	public FrenchFry(String arg1,long arg4) {
		name=arg1;
		expiryYear=arg4;
		
	}
	public FrenchFry(double arg1, int arg4) {
		expiryDate=arg1;
		carbs=arg4;
		
	}
	public FrenchFry(String arg4,String arg5) {
		name=arg4;
		hotel=arg5;
		
	}
	public FrenchFry(String arg1,int arg6,double arg5) {
		name=arg1;
		protiens=arg6;
		expiryDate=arg5;
		
	}
	
	public void show() {
		System.out.println("name :"+name);
		System.out.println("types :"+types);
		System.out.println("carbs :"+carbs);
		System.out.println("protiens :"+protiens);
		System.out.println("expiryDate :"+expiryDate);
		System.out.println("expiryYear :"+expiryYear);
		System.out.println("brand :"+brand);
		System.out.println("hotel :"+hotel);
		System.out.println("shape :"+shape);
		System.out.println("shape :"+shape);
		
		
	}

}
