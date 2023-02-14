package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.CandyCrush;
import com.xworkz.inheritance.thing.Game;

public class GameRunner {

	public static void main(String[] args) {
		
		CandyCrush candy=new CandyCrush();
		boolean interesting=candy.getInteresting();
		System.out.println(interesting);
		
		candy.type();
		
		Game game=new CandyCrush();
		boolean interesting1=game.getInteresting();
		System.out.println(interesting1);
		
		CandyCrush candy1=(CandyCrush) game;
		candy1.type();
		

	}

}
