package com.xworkz.object.thing;

public class WaterFall {
	private String name;
	private double height;
	private String location;

	public WaterFall() {
		System.out.println("no arg constructor");
	}

	public WaterFall(String name, String location, double height) {
		this.name = name;
		this.height = height;
		this.location = location;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in WaterFall" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof WaterFall) {
				System.out.println("obj is place");
				WaterFall casted = (WaterFall) obj;
				WaterFall left = this;
				WaterFall right = casted;
				if (left.name.equals(right.name) && left.height == right.height
						&& left.location.equals(right.location)) {
					System.out.println("left is equal to right");
					return true;

				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not WaterFall..");
			}

		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "[name" + this.name + "][height" + this.height + "][location" + this.location]";
	}

}
