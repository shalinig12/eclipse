package com.xworkz.object.thing;

public class Cake {
	private String flavor;
	private double weight;
	private String shape;
	private int price;
	
	public Cake() {
		System.out.println("no arg constructor");
	}
	
	public Cake(String flavor,double weight,String shape,int price) {
		this.flavor=flavor;
		this.weight=weight;
		this.shape=shape;
		this.price=price;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in cake" +obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Cake) {
				System.out.println("obj is place");
				Cake casted=(Cake) obj;
				Cake left=this;
				Cake right=casted;
				if (left.flavor.equals(right.flavor) && left.weight==right.weight &&
						left.shape.equals(right.shape) && left.price==right.price) {
					System.out.println("left is equal to right");
					return true;
					
				} else {
					System.err.println("left is not equal to right");
				}
				
			} else {
				System.err.println("obj is not cake..");
			}
			
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		
		return "[flavor" + this.flavor + "]\n[weight" + this.weight + "]\n[shape" +this.shape + "]\n[price" + this.price;
	}
		
		
	}


	


