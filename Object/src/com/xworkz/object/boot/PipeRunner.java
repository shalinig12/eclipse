package com.xworkz.object.boot;

import com.xworkz.object.thing.Pipe;

public class PipeRunner {

	public static void main(String[] args) {
		Pipe pipe=new Pipe();
		pipe.setCount(15);
		pipe.setPrice(235);
		pipe.setBrand("ash");
		pipe.setSeller("ravi");
		
		int count=pipe.getCount();
		System.out.println(count);
		int price=pipe.getPrice();
		System.out.println(price);
		String brand=pipe.getBrand();
		System.out.println(brand);
		String seller=pipe.getSeller();
		System.out.println(seller);
		
		System.out.println(pipe.hashCode() + "original" + System.identityHashCode(pipe));
		
		Pipe pipe1=new Pipe();
		pipe1.setCount(18);
		pipe1.setPrice(200);
		pipe1.setBrand("shri");
		pipe1.setSeller("ragu");
		
		int count1=pipe.getCount();
		System.out.println(count1);
		int price1=pipe.getPrice();
		System.out.println(price1);
		String brand1=pipe.getBrand();
		System.out.println(brand1);
		String seller1=pipe.getSeller();
		System.out.println(seller1);
		
		System.out.println(pipe1.hashCode() + "original" + System.identityHashCode(pipe1));
		
		boolean b1=pipe.equals(pipe1);
		System.out.println(b1);
		

	}

}
