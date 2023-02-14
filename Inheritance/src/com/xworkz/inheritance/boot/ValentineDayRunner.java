package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Feb14;
import com.xworkz.inheritance.thing.ValentineDay;

public class ValentineDayRunner {

	public static void main(String[] args) {
		 
		Feb14 feb14=new Feb14();
		boolean good=feb14.getGood();
		System.out.println(good);
		feb14.party();
		
		ValentineDay valentine=new Feb14();
		boolean good1=valentine.getGood();
		System.out.println(good1);
		
		Feb14 feb141=(Feb14) valentine;
		
		feb14.party();
		
	}

}
