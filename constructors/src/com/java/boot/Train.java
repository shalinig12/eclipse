package com.java.boot;

public class Train {
	public int types;
	public String name;
	public int coach;
	public boolean runs;
	public String from;
	public String to;
	public int ticket;
	public float distance;
	
	public Train(int arg1) {
		types=arg1;
	}
	public Train(String arg1) {
		name=arg1;
	}
	public Train(boolean arg1) {
		runs=arg1;
	}
	public Train(float arg2) {
		distance=arg2;
	}
	public Train( String arg4,int arg1) {
		from=arg4;
		types=arg1;
	}
	public Train(int arg1,String arg5) {
		types=arg1;
		to=arg5;
	}
	public Train(int arg1,boolean arg5) {
		types=arg1;
		runs=arg5;
	}
	public Train(int arg1,float arg4) {
		types=arg1;
		distance=arg4;
	}
	
	public void show() {
		System.out.println("train types:"+types);
		System.out.println("train name:"+name);
		System.out.println("train coach:"+coach);
		System.out.println("train runs:"+runs);
		System.out.println("train from:"+from);
		System.out.println("train to:"+to);
		System.out.println("train ticket"+ticket);
		System.out.println("train distance:"+distance);
	}
	
	
	

}
