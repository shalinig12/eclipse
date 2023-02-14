package com.xworkz.inheritance.thing;

public class ValentineDay {
	private boolean good;
	
	public ValentineDay() {
		System.out.println("no arg constructor");
	}
	public ValentineDay(boolean good) {
		this.good=good;
	}
    public boolean getGood() {
    	return this.good;
    }
}
