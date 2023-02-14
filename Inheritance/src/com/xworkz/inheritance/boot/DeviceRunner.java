package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Camera;
import com.xworkz.inheritance.thing.Device;

public class DeviceRunner {

	public static void main(String[] args) {
		
		Camera camera=new Camera();
		camera.capture();
		String brand=camera.getBrand();
		System.out.println(brand);
		int price=camera.getPrice();
		System.out.println(price);
		
		Device device=new Camera();
		String brand1=device.getBrand();
		System.out.println(brand1);
		int price1=device.getPrice();
		System.out.println(price1);
		
		Camera camera1=(Camera)device;
		camera1.capture();
	
				
				
				
				
		

	}

}
