package com.java.thing;

public class PhoneRunner {

	public static void main(String[] args) {
		Phone phone;
		phone=new Phone("samsung");
		phone.display();
		
		phone=new Phone(64.5f);
		phone.display();
		phone=new Phone(25);
		phone.display();
		phone=new Phone(true);
		phone.display();
		phone=new Phone(12);
		phone.display();
		phone=new Phone(2022);
		phone.display();
	}

}
