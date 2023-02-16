package com.xworkz.inheritance.thing;

public class OnionRagiRoti extends RagiRoti {
	private double weight;

	public OnionRagiRoti() {
		System.out.println("no arg on OnionRagiRoti");
	}

	public OnionRagiRoti(double weight) {

		this.weight = weight;

	}

	public double getWeight() {
		return this.weight;
	}

}
