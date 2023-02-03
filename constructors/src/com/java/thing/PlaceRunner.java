package com.java.thing;

public class PlaceRunner {

	public static void main(String[] args) {
		Place place;
		place=new Place("kuudli",6,"shimoga","karnataka");
		place.Display();
		
		place=new Place("kuudli");
	    place.Display();
		
		place=new Place(6);
		place.Display();
		
		place=new Place("shimoga","karnataka");
		place.Display();
		
		place=new Place(6,"india");
		place.Display();
	}

}
