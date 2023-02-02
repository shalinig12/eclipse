package com.java.boot;

public class Burger {
	public String brand;
	public int types;
	public int layers;
	public boolean chicken;
	public boolean veg;
	public String hotel;
	public int price;
	public float size;
	public double preparedDate;
	public long preparedYear;
	public double spoilDate;
	public long spoilYear;
	public int noofpacks;
	public int ingredients;
	public boolean willbuy;
	
	public Burger(String brand,int types,int layers,boolean chicken,boolean veg,String hotel,int price,float size,double preparedDate,long preparedYear,double spoilDate,long spoilYear,int noofpacks,int ingredients,boolean willbuy) {
		this.brand=brand;
		this.types=types;
		this.layers=layers;
		this.chicken=chicken;
		this.veg=veg;
		this.hotel=hotel;
		this.price=price;
		this.size=size;
		this.preparedDate=preparedDate;
		this.preparedYear=preparedYear;
		this.spoilDate=spoilDate;
		this.spoilYear=spoilYear;
		this.noofpacks=noofpacks;
		this.ingredients=ingredients;
		this.willbuy=willbuy;
		
		
		
	}
	public void show() {
		System.out.println(this);
		System.out.println(this.brand);
		System.out.println(this.types);
		System.out.println(this.layers);
		System.out.println(this.chicken);
		System.out.println(this.veg);
		System.out.println(this.hotel);
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(this.preparedDate);
		System.out.println(this.preparedYear);
		System.out.println(this.spoilDate);
		System.out.println(this.spoilYear);
		System.out.println(this.noofpacks);
		System.out.println(this.ingredients);
		System.out.println(this.willbuy);
		
	}
	

}
