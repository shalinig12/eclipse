package com.xworkz.object.boot;

import com.xworkz.object.thing.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		Cake cake=new Cake("papaya", 2, "round", 230);
		System.out.println(cake);
		
		
		Cake cake1=new Cake("venila", 3, "round", 250);
		System.out.println(cake1);
		
		Cake cake2=new Cake("venila", 3, "round", 250);
		System.out.println(cake2);
		
		boolean b1=cake.equals(cake2);
		System.out.println(b1);
		
		boolean b2=cake1.equals(cake2);
		System.out.println(b2);
		
		
	}

}
