package com.java.boot;

public class Frame {
	public String name;
	public int types;
	public int copies;
	public float size;
	public boolean clear;
	public double mnfctrDate;
	public long mnfctrYear;
	public String shop;
	public String buyer;
	public boolean strips;
	public String seller;
	public String editor;
	
	public Frame(String name,int types,int copies,float size,boolean clear,double mnfctrDate,long mnfctrYear,String shop,String buyer,boolean strips,String seller,String editor) {
		this.name=name;
		this.types=types;
		this.copies=copies;
		this.size=size;
		this.clear=clear;
		this.mnfctrDate=mnfctrDate;
		this.mnfctrYear=mnfctrYear;
		this.shop=shop;
		this.buyer=buyer;
		this.strips=strips;
		this.seller=seller;
		this.editor=editor;
	}
	public void show() {
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(this.types);
		System.out.println(this.copies);
		System.out.println(this.size);
		System.out.println(this.clear);
		System.out.println(this.mnfctrDate);
		System.out.println(this.mnfctrYear);
		System.out.println(this.shop);
		System.out.println(this.buyer);
		System.out.println(this.strips);
		System.out.println(this.seller);
		System.out.println(this.editor);
	}


}
