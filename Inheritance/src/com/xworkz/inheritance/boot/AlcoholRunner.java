package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Alcohol;
import com.xworkz.inheritance.thing.Whiskey;

public class AlcoholRunner {

	public static void main(String[] args) {

		Whiskey whiskey = new Whiskey();
		int price = whiskey.getPrice();
		System.out.println(price);
		whiskey.taste();

		Alcohol alcohol = new Whiskey();
		int price1 = alcohol.getPrice();
		System.out.println(price1);

		Whiskey whiskey1 = (Whiskey) alcohol;
		whiskey1.taste();

	}

}
