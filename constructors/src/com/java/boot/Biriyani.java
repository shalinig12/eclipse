package com.java.boot;

public class Biriyani {
	public String type;
	public int ingredients;
	public int leaves;
	public boolean tasty;
	public boolean beerAdded;
	public String hotel;
	public double expiryDate;
	public long expiryYear;
	public double preparedDate;
	public long preparedYear;
	public String sheff;
	public boolean expired;
	public String rice;
	public String seller;
	public String buyer;
	
	public Biriyani(String arg1) {
		type=arg1;
	}
	public Biriyani(String arg1,int arg2) {
		type=arg1;
		ingredients=arg2;
	}
	public Biriyani(String arg1,int arg3,boolean arg5) {
		type=arg1;
		leaves=arg3;
		tasty=arg5;
	}
	public Biriyani(String arg1,boolean arg3) {
		type=arg1;
		beerAdded=arg3;
	}
	
	public Biriyani(int arg1) {
		ingredients=arg1;
	}
	public Biriyani(boolean arg5) {
		tasty=arg5;
	}
	public Biriyani(String arg1,double arg4) {
		type=arg1;
		expiryDate=arg4;
	}
	public Biriyani(boolean arg3,int arg9) {
		beerAdded=arg3;
	    ingredients=arg9;
	}
		
	public Biriyani(String arg1,String arg5) {
		type=arg1;
		hotel=arg5;
	}
	public Biriyani(int arg1, String arg5) {
		ingredients=arg1;
		hotel=arg5;
	}
	public Biriyani(long arg5,boolean arg7) {
		preparedYear=arg5;
		expired=arg7;
	}
	public Biriyani(String arg1,long arg6) {
		type=arg1;
		preparedYear=arg6;
	}
	public Biriyani(long arg5,int arg4,boolean arg8) {
		expiryYear=arg5;
		leaves=arg4;
		expired=arg8;
		
	}
	public Biriyani(long arg1, int arg6) {
		expiryYear=arg1;
		leaves=arg6;
	}
	public Biriyani(String arg1,String arg6,String arg9) {
		type=arg1;
		rice=arg6;
		buyer=arg9;
	}
	
	public void show() {
		System.out.println("biriyani type:"+type);
		System.out.println("biriyani ingredients:"+ingredients);
		System.out.println("biriyani leaves:"+leaves);
		System.out.println("biriyani tasty:"+tasty);
		System.out.println("biriyani beerAdded:"+beerAdded);
		System.out.println("biriyani hotel:"+hotel);
		System.out.println("biriyani expiryDate:"+expiryDate);
		System.out.println("biriyani expiryYear:"+expiryYear);
		System.out.println("biriyani preparedDate:"+preparedDate);
		System.out.println("biriyani preparedYear:"+preparedYear);
		System.out.println("biriyani sheff:"+sheff);
		System.out.println("biriyani expired:"+expired);
		System.out.println("biriyani rice:"+rice);
		System.out.println("biriyani seller:"+seller);
		System.out.println("biriyani buyer:"+buyer);
	
	}
	
	

}
