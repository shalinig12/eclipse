package com.xworkz.object.boot;

import com.xworkz.object.thing.Adike;

public class AdikeRunner {

	public static void main(String[] args) {
		Adike adike=new Adike();
		adike.setCount(12);
		adike.setPrice(34);
		adike.setSeller("bhuvi");
		adike.setShape("round");
		
		int count=adike.getCount();
		System.out.println(count);
		int price=adike.getPrice();
		System.out.println(price);
		String seller=adike.getSeller();
	    System.out.println(seller);
	    String shape=adike.getShape();
	    System.out.println(shape);
	    
	    
	    System.out.println(adike.hashCode() + "original" + System.identityHashCode(adike));
	    
	    Adike adike1=new Adike();
		adike1.setCount(13);
		adike1.setPrice(35);
		adike1.setSeller("riya");
		adike1.setShape("triangle");
		
		int count1=adike.getCount();
		System.out.println(count1);
		int price1=adike.getPrice();
		System.out.println(price1);
		String seller1=adike.getSeller();
	    System.out.println(seller1);
	    String shape1=adike.getShape();
	    System.out.println(shape1);
	    
	    
	    System.out.println(adike.hashCode() + "original" + System.identityHashCode(adike1));
	    
	    boolean b1=adike.equals(adike1);
	    System.out.println(b1);
	    
		
	}

}
