package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.TubeLight;
import com.xworkz.inheritance.thing.WhiteTubeLight;

public class TubeLightRunner {

	public static void main(String[] args) {
		TubeLight tube=new WhiteTubeLight();
		tube.Color();
		TubeLight tube1=new WhiteTubeLight();
		tube1.Lenght();
		
	}

}
