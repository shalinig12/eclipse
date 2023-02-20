package com.xworkz.encapsulation.thing;

public class Coconut {
	
	private String shape;
	private int price;
	private String owner;
	private int count;
	
	public Coconut() {
		System.out.println("nop arg constructor");
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getShape() {
		return shape;
	}
	public int getPrice() {
		return price;
	}
	public String getOwner() {
		return owner;
	}
	public int getCount() {
		return count;
	}
	
	
	
	@Override
	public String toString() {
		
		return "Shape:" +shape + "Price" + price + "Owner" + owner + "Count" + count;
	}
	
	@Override
	public int hashCode() {
		
		return 555;
	}

}
