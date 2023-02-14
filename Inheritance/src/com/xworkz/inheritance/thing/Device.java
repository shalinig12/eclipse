package com.xworkz.inheritance.thing;

public class Device {
	private String brand;
	private int price;
	
	public Device() {
		System.out.println("no arg constructor in Device");
	}
	
	
	public Device(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getPrice() {
		return this.price;
	}


}
