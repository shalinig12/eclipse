package com.xworkz.object.thing;

public class Door {
	private int count;
	private int price;
	private String brand;
	private String seller;
	
	public Door() {
		System.out.println("no arg constructor");
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getCount() {
		return count;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public String getSeller() {
		return seller;
	}
	
	@Override
	public String toString() {
		
		return "count"+count + "price" +price+ "brand" +brand+ "seller" +seller;
	}
	
	@Override
	public int hashCode() {
		
		return 89;
	}

	

}




	


