package com.xworkz.object.thing;

public class Adike {
	private int count;
	private int price;
	private String shape;
	private String seller;
	
	public Adike() {
		System.out.println("no arg constructor");
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public int getCount() {
		return count;
	}
	public int getPrice() {
		return price;
	}
	public String getSeller() {
		return seller;
	}
	public String getShape() {
		return shape;
	}
	
	@Override
	public String toString() {
		
		return  "Count" + count + "price" + price + "Seller" + seller + "Shape" + shape  ;
	}
	
	@Override
	public int hashCode() {
		
		return 444;
	}

}
