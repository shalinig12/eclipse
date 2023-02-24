package com.xworkz.object.thing;

public class FootWare {
	private String brand;
	private double size;
	private int type;

	public FootWare() {
		System.out.println("no arg constructor");
	}

	public FootWare(String brand, double size, int type) {
		this.brand = brand;
		this.size = size;
		this.type = type;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in footware" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof FootWare) {
				System.out.println("obj is place");
				FootWare casted = (FootWare) obj;
				FootWare left = this;
				FootWare right = casted;
				if (left.brand.equals(right.brand) && left.type == right.type && left.size == right.size) {
					System.out.println("left is equal to right");
					return true;

				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not footware..");
			}

		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "[brand" + this.brand + "]\n[size" + this.size + "]\n[type" + this.type+"]";
	}

}
