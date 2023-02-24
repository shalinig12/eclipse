package com.xworkz.object.thing;

public class Tv {
	private String brand;
	private int price;
	private double size;

	public Tv() {
		System.out.println("no arg constructor");
	}

	public Tv(String brand, int price, double size) {
		this.brand = brand;
		this.price = price;
		this.size = size;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in tv" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Tv) {
				System.out.println("obj is place");
				Tv casted = (Tv) obj;
				Tv left = this;
				Tv right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.size == right.size) {
					System.out.println("left is equal to right");
					return true;

				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not tv..");
			}

		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "[brand" + this.brand + "][price" + this.price + "][size" + this.size;
	}

}
