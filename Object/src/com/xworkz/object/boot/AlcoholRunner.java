package com.xworkz.object.boot;

import com.xworkz.object.thing.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {
		Alcohol al=new Alcohol("bakardi", 450, 45, 3);
		System.out.println(al);
		
		Alcohol al1=new Alcohol("horse", 500, 78, 6);
		System.out.println(al1);
		
		Alcohol al2=new Alcohol("bakardi", 450, 45, 3);
		System.out.println(al2);
		
		boolean b1=al.equals(al2);
		System.out.println(b1);
		
		boolean b2=al1.equals(al2);
		System.out.println(b2);
		
	}

}
