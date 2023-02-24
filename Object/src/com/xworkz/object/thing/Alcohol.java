package com.xworkz.object.thing;

public class Alcohol {
	private String brand;
	private int percentage;
	private int price;
	private int type;
	
	public Alcohol() {
		System.out.println("no arg constructor");
	}
	
	public Alcohol(String brand, int price,int percentage,int type) {
		this.brand = brand;
		this.price = price;
		this.percentage = percentage;
		this.type=type;

	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Alcohol" +obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Alcohol) {
				System.out.println("obj is place");
				Alcohol casted=(Alcohol) obj;
				Alcohol left=this;
				Alcohol right=casted;
				if (left.brand.equals(right.brand) && left.price==right.price && left.percentage==right.percentage && left.type==right.type) {
					System.out.println("left is equal to right");
					return true;
					
				} else {
					System.err.println("left is not equal to right");
				}
				
			} else {
				System.err.println("obj is not Alcohol..");
			}
			
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		
		return "brand" + this.brand + "price" + this.price + "percentage" +this.percentage + "type" + type;
	}
		
		
	}




	


