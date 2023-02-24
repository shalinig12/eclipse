package com.xworkz.object.boot;

import com.xworkz.object.thing.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {
		WaterFall water=new WaterFall("joga", "shimoga", 56.7);
		System.out.println(water);
		
		WaterFall water1=new WaterFall("niagara", "usa", 56.7);
		System.out.println(water1);
		
		WaterFall water2=new WaterFall("joga", "shimoga", 56.7);
		System.out.println(water2);
		
		boolean b1=water.equals(water2);
		System.out.println(b1);
		
		boolean b2=water1.equals(water2);
		System.out.println(b2);
	}

}
