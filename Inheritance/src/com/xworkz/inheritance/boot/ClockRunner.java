package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Clock;
import com.xworkz.inheritance.thing.TitanClock;

public class ClockRunner {

	public static void main(String[] args) {
		Clock clock=new TitanClock();
		clock.Frame();
		Clock clock1=new TitanClock();
		clock1.FrameColor();
	}

}
