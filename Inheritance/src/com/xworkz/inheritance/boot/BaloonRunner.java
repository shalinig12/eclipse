package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Baloon;
import com.xworkz.inheritance.thing.HeliumBaloon;

public class BaloonRunner {

	public static void main(String[] args) {
		Baloon baloon=new HeliumBaloon();
		baloon.Color();
		Baloon baloon1=new HeliumBaloon();
		baloon1.Expands();
	}

}
