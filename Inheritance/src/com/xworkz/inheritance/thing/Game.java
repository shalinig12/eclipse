package com.xworkz.inheritance.thing;

public class Game {
	
	private boolean interesting;
	
	public Game() {
		System.out.println("no arg constructor");
	}
	
	public Game(boolean interesting) {
		this.interesting=interesting;
		
	}
	public boolean getInteresting() {
		return this.interesting;
	}

}
