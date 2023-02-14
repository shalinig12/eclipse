package com.xworkz.inheritance.thing;

public class Alcohol {
	private int price;

	public Alcohol() {
		System.out.println("No-arg constructor in Alcohol");
	}

	public Alcohol(int price) {
		this.price = price;
		System.out.println(this.price);
	}

	public int getPrice() {
		return this.price;
	}

}
