package com.java.thing;

public class Phone {
	public String name;
	public float storage;
	public int prize;
	public boolean working;
	public double mnfctrDate;
	public long mnfctrYear;
	
	public Phone() {
		System.out.println("starts from phone");
	}
	 
	public Phone(String name) {
		this.name=name;
	}
	public Phone(float storage) {
		this.storage=storage;
	}
	public Phone(int prize) {
		this.prize=prize;
	}
	public Phone(boolean working)
	{
		this.working=working;
	}
	public Phone(long mnfctrYear)
	{
		this.mnfctrYear=mnfctrYear;
	}
	
	public void init(String name,float storage,int prize,boolean working,double mnfctrDate,long mnfctrDate) {
		this.name=name;
		this.storage=storage;
		this.prize=prize;
		this.working=working;
		this.mnfctrDate=mnfctrDate;
		this.mnfctrYear=mnfctrYear;
	}
	public void display() {
		System.out.println("running code");
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(this.storage);
		System.out.println(this.prize);
		System.out.println(this.working);
		System.out.println(this.mnfctrDate);
		System.out.println(this.mnfctrDate);
	}
	
	
	
	
	
	
	

}
