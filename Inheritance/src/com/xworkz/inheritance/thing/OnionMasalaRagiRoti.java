package com.xworkz.inheritance.thing;

public class OnionMasalaRagiRoti extends OnionRagiRoti {
	private double thickness;
	
	
	public OnionMasalaRagiRoti() {
		System.out.println("no arg on OnionMasalaRagiRoti");
	}
	public OnionMasalaRagiRoti(double thickness) {
		this.thickness=thickness;
		
	}
	public double getThickness() {
		return this.thickness;
	}

}
