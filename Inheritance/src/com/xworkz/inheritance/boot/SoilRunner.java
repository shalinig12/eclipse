package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.ClaySoil;
import com.xworkz.inheritance.thing.Soil;

public class SoilRunner {

	public static void main(String[] args) {
		Soil soil=new ClaySoil();
		soil.Color();
		
		Soil soil1=new ClaySoil();
		boolean odor=soil1.setOdor();
		System.out.println(odor);
		
		
	}

}
