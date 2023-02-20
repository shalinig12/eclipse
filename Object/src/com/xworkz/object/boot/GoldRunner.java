package com.xworkz.object.boot;

import com.xworkz.object.thing.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		Gold gold=new Gold();
		gold.setCount(45);
		gold.setPrice(275);
		gold.setBrand("kdm");
		gold.setSeller("shruthi");
		
		int count=gold.getCount();
		System.out.println(count);
		int price=gold.getPrice();
		System.out.println(price);
		String brand=gold.getBrand();
		System.out.println(brand);
		String seller=gold.getSeller();
		System.out.println(seller);
		
		System.out.println(gold.hashCode() + "original" + System.identityHashCode(gold));
		
		Gold gold1=new Gold();
		gold1.setCount(18);
		gold1.setPrice(200);
		gold1.setBrand("a24");
		gold1.setSeller("ragu");
		
		int count1=gold1.getCount();
		System.out.println(count1);
		int price1=gold1.getPrice();
		System.out.println(price1);
		String brand1=gold1.getBrand();
		System.out.println(brand1);
		String seller1=gold1.getSeller();
		System.out.println(seller1);
		
		System.out.println(gold1.hashCode() + "original" + System.identityHashCode(gold1));
		
		boolean b1=gold.equals(gold1);
		System.out.println(b1);
		

	




	}

}
