package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {
		 Coconut coco=new Coconut();
		 coco.setCount(45);
		 coco.setShape("round");
		 coco.setPrice(23);
		 coco.setOwner("Ravi");
		 
		 int count=coco.getCount();
		 System.out.println(count);
		 String shape=coco.getShape();
		 System.out.println(shape);
		 int price=coco.getPrice();
		 System.out.println(price);
		 String owner=coco.getOwner();
		 System.out.println(owner);
		 
		 System.out.println(coco.hashCode() + "original" + System.identityHashCode(coco) );
		 
		 Coconut coco1=new Coconut();
		 coco1.setCount(56);
		 coco1.setShape("slant");
		 coco1.setPrice(67);
		 coco1.setOwner("Krish");
		 
		 int count1=coco.getCount();
		 System.out.println(count1);
		 String shape1=coco.getShape();
		 System.out.println(shape1);
		 int price1=coco.getPrice();
		 System.out.println(price1);
		 String owner1=coco.getOwner();
		 System.out.println(owner1);
		 
		 System.out.println(coco.hashCode() + "original" + System.identityHashCode(coco1) );
		 
		 boolean b1 = coco.equals(coco1);
		 System.out.println(b1);

	}

}
