package com.xworkz.object.boot;

import com.xworkz.object.thing.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {
		FootWare foot=new FootWare("woodland", 8.8, 7);
		System.out.println(foot);
		
		
		FootWare foot1=new FootWare("walkmate", 9.7, 8);
		System.out.println(foot1);
		
		
		FootWare foot2=new FootWare("walkmate", 9.7, 8);
		System.out.println(foot2);
		
		boolean b1=foot.equals(foot1);
		System.out.println(b1);
		
		boolean b2=foot1.equals(foot2);
		System.out.println(b2);
		
		
		

	}

}
