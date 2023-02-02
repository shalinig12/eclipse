package com.java.boot;

public class TrainRunner {

	public static void main(String[] args) {
		Train ref1=new Train(5);
		ref1.show();
		Train ref2=new Train("shatabdi");
		ref1.show();
		Train ref3=new Train(24);
		ref3.show();
		Train ref4=new Train(true);
		ref4.show();
		Train ref5=new Train("shimoga");
		ref5.show();
		Train ref6=new Train("pune");
		ref6.show();
		Train ref7=new Train(67);
		ref7.show();
		Train ref8=new Train(56.7f);
		ref8.show();
		
	}

}
