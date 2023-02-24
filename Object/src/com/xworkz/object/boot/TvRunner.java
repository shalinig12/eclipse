package com.xworkz.object.boot;

import com.xworkz.object.thing.Tv;

public class TvRunner {
	public static void main(String[] args) {

		Tv tv = new Tv("lg", 45000, 45.5);
		System.out.println(tv);

		Tv tv1 = new Tv("sony", 50000, 67.5);
		System.out.println(tv1);

		Tv tv2 = new Tv("sony", 50000, 67.5);
		System.out.println(tv2);

		boolean b1 = tv1.equals(tv1);
		System.out.println(b1);

		boolean b2 = tv.equals(tv1);
		System.out.println(b2);

	}

}
