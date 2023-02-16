package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.OnionMasalaRagiRoti;
import com.xworkz.inheritance.thing.OnionRagiRoti;
import com.xworkz.inheritance.thing.RagiRoti;
import com.xworkz.inheritance.thing.Roti;

public class RotiRunner {

	public static void main(String[] args) {
		OnionMasalaRagiRoti o1 = new OnionMasalaRagiRoti();
		double thickness = o1.getThickness();
		System.out.println(thickness);
		double weight = o1.getWeight();
		System.out.println(weight);
		double calories = o1.getCalories();
		System.out.println(calories);
		String shape = o1.getShape();
		System.out.println(shape);

		OnionRagiRoti o2 = new OnionMasalaRagiRoti();
		double weight1 = o2.getWeight();
		System.out.println(weight1);
		double calories1 = o2.getCalories();
		System.out.println(calories1);
		String shape1 = o2.getShape();
		System.out.println(shape1);

		if (o2 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti = (OnionMasalaRagiRoti) o2;
			double thickness1 = roti.getThickness();
			System.out.println(thickness1);

		} else
			System.err.println("o2 is not OnionMasalaRagiRoti ");

		RagiRoti o3 = new OnionMasalaRagiRoti();
		double calories2 = o3.getCalories();
		System.out.println(calories2);
		String shape2 = o3.getShape();
		System.out.println(shape2);

		if (o3 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti2 = (OnionMasalaRagiRoti) o3;
			double thickness2 = roti2.getThickness();
			System.out.println(thickness2);

		} else
			System.err.println(" o3 is not OnionMasalaRagiRoti");

		if (o3 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti2 = (OnionMasalaRagiRoti) o3;
			double weight2 = roti2.getThickness();
			System.out.println(weight2);

		} else
			System.err.println("o3 is not OnionMasalaRagiRoti ");

		Roti o4 = new OnionMasalaRagiRoti();
		String shape3 = o4.getShape();
		System.out.println(shape3);

		if (o4 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti3 = (OnionMasalaRagiRoti) o4;
			double thickness3 = roti3.getThickness();
			System.out.println(thickness3);

		} else
			System.err.println("o4 is not OnionMasalaRagiRoti");

		if (o4 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti3 = (OnionMasalaRagiRoti) o4;
			double weight3 = roti3.getWeight();
			System.out.println(weight3);

		} else
			System.err.println("o4 is not OnionMasalaRagiRoti");

		if (o4 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti3 = (OnionMasalaRagiRoti) o4;
			String shape4 = roti3.getShape();
			System.out.println(shape4);

		} else
			System.err.println("o4 is not OnionMasalaRagiRoti");

		OnionRagiRoti m1 = new OnionRagiRoti();
		double weight4 = m1.getWeight();
		System.out.println(weight4);
		double calories4 = m1.getCalories();
		System.out.println(calories4);
		String shape4 = m1.getShape();
		System.out.println(shape4);

		RagiRoti m2 = new OnionRagiRoti();
		double calories5 = m2.getCalories();
		System.out.println(calories5);
		String shape5 = m2.getShape();
		System.out.println(shape5);
		
		if (m2 instanceof OnionRagiRoti ) {
			OnionRagiRoti roti5=(OnionRagiRoti)m2;
			double weight5= roti5.getWeight();
			System.out.println(weight5);
			
		}
		else
			System.out.println("m2 is not OnionRagiRoti");
		
		Roti m3=new OnionRagiRoti();
		String shape6=m3.getShape();
		System.out.println(shape6);
		
		if(m3 instanceof OnionRagiRoti) {
			OnionRagiRoti roti6=(OnionRagiRoti)m3;
		    double weight6=roti6.getWeight();
		    System.out.println(weight6);
		}
		else
			System.out.println("m3 is not OnionRagiRoti");
		
		
		if(m3 instanceof OnionRagiRoti) {
			OnionRagiRoti roti7=(OnionRagiRoti)m3;
			double calories6 = roti7.getCalories();
		    System.out.println(calories6);
		}
		else
			System.out.println("m3 is not OnionRagiRoti");
		
		
		Roti r1=new Roti();
		System.out.println(r1.getShape());
	}
		

	
}
