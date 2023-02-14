package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Soap;

public class SoapRunner {

	public static void main(String[] args) {
		Soap soap=new Soap();
		soap.setBrand("guhbu");
		String ref=soap.getBrand();
		System.out.println(ref);
	    soap.setName("bjuyfi");
	    String ref2=soap.getName();
	    System.out.println(ref2);

	}

}
