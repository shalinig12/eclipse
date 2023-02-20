package com.xworkz.object.thing;

public class Paint {
	private int noOfColor;
	private String brand;
	private int price;
	private String owner;
	
	public Paint() {
		System.out.println("no arg constructor");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
    public void setNoOfColor(int noOfColor) {
		this.noOfColor = noOfColor;
	}
    
    public void setPrice(int price) {
		this.price = price;
	}
    
    public void setOwner(String owner) {
		this.owner = owner;
	}
    
    public int getNoOfColor() {
		return noOfColor;
	}
    
    public String getBrand() {
		return brand;
	}
    
    public double getPrice() {
		return price;
	}
    
    public String getOwner() {
		return owner;
	}
    
    
    
    @Override
    public String toString() {
    	
    	return "Brand:"+brand + "Cost:"+cost + "shop:"+shop + "owner:"+owner;
    }
    @Override
    public int hashCode() {
    	
    	return 785;
    }
    
    

}
