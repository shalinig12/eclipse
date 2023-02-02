package com.java.boot;

public class Rainbow {
        public String area;
        public String types;
        public int colors;
        public int places;
        public boolean bright;
        public double date;
        public long year;
        
        
        public Rainbow(String area,String types,int colors,int places,boolean bright,double date, long year) {
        	this.area=area;
        	this.types=types;
        	this.colors=colors;
        	this.places=places;
        	this.bright=bright;
        	this.date=date;
        	this.year=year;
        	
        	
        	}
        
        public void show() {
        	System.out.println(this);
        	System.out.println(this.area);
        	System.out.println(this.types);
        	System.out.println(this.colors);
        	System.out.println(this.places);
        	System.out.println(this.bright);
        	System.out.println(this.date);
        	System.out.println(this.year);
        	
        }
}
