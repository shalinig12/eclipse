package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.CoGarland;
import com.xworkz.inheritance.thing.Garland;

public class GarlandRunner {

	public static void main(String[] args) {
		Garland gar=new CoGarland();
		gar.Color();
		Garland gar1=new CoGarland();
		gar1.Lenght();
	}

}
