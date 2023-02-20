package com.xworkz.object.boot;

import com.xworkz.object.thing.Door;


public class DoorRunner {

	public static void main(String[] args) {
		Door door=new Door();
		door.setCount(45);
		door.setPrice(275);
		door.setBrand("kdm");
		door.setSeller("shruthi");
		
		int count=door.getCount();
		System.out.println(count);
		int price=door.getPrice();
		System.out.println(price);
		String brand=door.getBrand();
		System.out.println(brand);
		String seller=door.getSeller();
		System.out.println(seller);
		
		System.out.println(door.hashCode() + "original" + System.identityHashCode(door));
		
		Door door1=new Door();
		door1.setCount(18);
		door1.setPrice(200);
		door1.setBrand("a24");
		door1.setSeller("ragu");
		
		int count1=door1.getCount();
		System.out.println(count1);
		int price1=door1.getPrice();
		System.out.println(price1);
		String brand1=door1.getBrand();
		System.out.println(brand1);
		String seller1=door1.getSeller();
		System.out.println(seller1);
		
		System.out.println(door1.hashCode() + "original" + System.identityHashCode(door1));
		
		boolean b1=door.equals(door1);
		System.out.println(b1);
		

	




	

}

	}
		
	
		

	

