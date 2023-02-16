package com.xworkz.inheritance.thing;

public class RagiRoti extends Roti {
	private double calories;

	public RagiRoti() {
		System.out.println("no arg constructor in Ragiroti");
	}

	public RagiRoti(double calories) {
		this.calories = calories;

	}

	public double getCalories() {
		return this.calories;
	}

}
