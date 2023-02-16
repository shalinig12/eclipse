package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Tiger;
import com.xworkz.inheritance.thing.Tigress;

public class TigerRunner {

	public static void main(String[] args) {
		Tiger tig=new Tigress();
		tig.Food();
		Tiger tig1=new Tigress();
		tig1.Legs();
	}

}
