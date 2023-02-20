package com.xworkz.object.boot;

import com.xworkz.object.thing.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint=new Paint();
		paint.setBrand("asian");
		paint.setNoOfColor(7);
		paint.setOwner("ragu");
		paint.setPrice(456);
		
		String brand=paint.getBrand();
		System.out.println(brand);
		int color=paint.getNoOfColor();
		System.out.println(color);
		String owner=paint.getOwner();
		System.out.println(owner);
		int price=(int) paint.getPrice();
		System.out.println(price);
		
		System.out.println(paint.hashCode() + "original" + System.identityHashCode(paint));
		
		Paint paint1=new Paint();
		paint1.setBrand("wipe");
		paint1.setNoOfColor(3);
		paint1.setOwner("manish");
		paint1.setPrice(345);
		 
		
	    String brand1=paint1.getBrand();
	    System.out.println(brand1);
	    int color1=paint1.getNoOfColor();
	    System.out.println(color1);
	    String owner1=paint1.getOwner();
	    System.out.println(owner1);
	    int price1=(int) paint1.getPrice();
	    System.out.println(price1);
	    
	    System.out.println(paint.hashCode() + "original" + System.identityHashCode(paint1));
	    
	    boolean b1=paint.equals(paint1);
	    System.out.println(b1);
	    
	    
	    
	}

}
