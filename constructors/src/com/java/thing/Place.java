package com.java.thing;

public class Place {
	public String name;
	public int population;
	public String district;
	public String State;
	public String country;

	public Place() {
		System.out.println("starts from place");
	}

	public Place(String name, int population, String district, String State ) {
		super();
		this.name = name;
		this.population = population;
		this.district = district;
		this.State = State;
		
	}

	public Place(String name) {
		this.name = name;
	}

	public Place(int population) {
		this.population = population;

	}

	public Place(String district,String State) {
		this.district=district;
		this.State=State;
		
	}

	public Place(int population, String country) {
		this.population = population;
		this.country = country;
	}
	public void init(String name,int population,String district,String State,String country) {
		this.name=name;
		this.population=population;
		this.district=district;
		this.State=State;
		this.country=country;
		
	}
	
	
	public void Display() {
		System.out.println("display data");
		System.out.println("name:"+this.name);
		System.out.println("population:"+this.population);
		System.out.println("district:"+this.district);
		System.out.println("state:"+this.State);
		System.out.println("country:"+this.country);
	
	}

}
