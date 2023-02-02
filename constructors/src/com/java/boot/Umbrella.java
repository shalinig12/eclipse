package com.java.boot;

public class Umbrella {
	public String brand;
	public String color;
	public int price;
	public boolean ready;
	public  double mnfctrDate;
	public long mnfctrYear;
	public int number;
	public boolean willbuy;
	public String shop;
	public int covers;
	
	public Umbrella(String brand,String color,int price,boolean ready,double mnfctrDate,long mnfctrYear,int number,boolean willbuy,String shop,int covers) {
		this.brand=brand;
		this. color=color;
		this. price=price;
		this.ready=ready;
		this.mnfctrDate=mnfctrDate;
		this.mnfctrYear=mnfctrYear;
		this.number=number;
		this.willbuy=willbuy;
		this.shop=shop;
		this.covers=covers;
	}
	public void show() {
		System.out.println(this);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.ready);
		System.out.println(this.mnfctrDate);
		System.out.println(this.mnfctrYear);
		System.out.println(this.number);
		System.out.println(this.willbuy);
		System.out.println(this.shop);
		System.out.println(this.covers);
		
	}

}
