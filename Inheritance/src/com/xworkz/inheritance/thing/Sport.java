package com.xworkz.inheritance.thing;

public class Sport {
	private int players;
	
	public Sport() {
		System.out.println("no arg constructor");
	}
	
	public Sport(int players)
	{
		this.players=players;
	}
	
	public int getPlayers() {
		return this.players;
	}
}
