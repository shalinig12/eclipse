package com.xworkz.inheritance.thing;

public class Roti {
	private String shape;
	
	public Roti() {
		System.out.println("no arg constructor in roti");
	}
	public Roti(String shape) {
		this.shape=shape;
	}
	public String getShape() {
		return this.shape;
	}

}
