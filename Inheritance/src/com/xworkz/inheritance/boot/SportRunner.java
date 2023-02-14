package com.xworkz.inheritance.boot;


import com.xworkz.inheritance.thing.Cricket;
import com.xworkz.inheritance.thing.Sport;

public class SportRunner {

	public static void main(String[] args) {
		Cricket cricket=new Cricket();
		int players=cricket.getPlayers();
		System.out.println(players);
		cricket.favorite();
		
		Sport sport1=new Cricket();
		int players1=cricket.getPlayers();
		System.out.println(players1);
		Cricket cricket1=(Cricket) sport1;
		cricket1.favorite();
		
		
		
	}

}
