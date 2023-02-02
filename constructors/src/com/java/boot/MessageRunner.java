package com.java.boot;

public class MessageRunner {

	public static void main(String[] args) {
		Message ref1=new Message(45);
		ref1.show();
		Message ref2=new Message(85);
		ref2.show();
		Message ref3=new Message("shalini");
		ref3.show();
		Message ref4=new Message("muni");
		ref4.show();
		Message ref5=new Message(true);
		ref5.show();
		

	}

}
