package com.xworkz.exception.boot;

import com.xworkz.exception.event.Doctor;
import com.xworkz.exception.event.Engineer;

public class DoctorRunner {

	public static void main(String[] args) {
		Engineer eng=new Engineer(5678,"shalini");
		System.out.println(eng);
		
		Engineer eng1=new Engineer(5678,"shalini","shalini200smg@gmail.com");
		System.out.println(eng1);
		
		Engineer eng3=new Engineer(5678,"shalini","shalini@gmail.com",23);
		System.out.println(eng3);
		
		boolean b1=eng1.equals(eng);
		System.out.println(b1);
		
		boolean b2=eng.equals(eng3);
		System.out.println(b2);
		
		boolean b3=eng1.equals(eng3);
		System.out.println(b3);
		
		boolean b4=eng3.equals(eng);
		System.out.println(b4);
		
		System.out.println("==========================>");
		
		Doctor doc=new Doctor(45, "soni");
		System.out.println(doc);
		
		Doctor doc1=new Doctor(34,"soni","soni@gmail");
		System.out.println(doc1);
		
		Doctor doc2=new Doctor(34,"soni","soni@gmail",22);
		System.out.println(doc2);
		
		Doctor doc3=new Doctor(456,"soni","soni@gmail",22,"heart","narayan");
		System.out.println(doc3);
		
		
		boolean bo1=doc.equals(doc3);
		System.out.println(bo1);
		
		boolean bo2=doc.equals(doc2);
		System.out.println(bo2);
		
		boolean bo3=doc1.equals(doc2);
		System.out.println(bo3);
		
		boolean bo4=doc1.equals(doc3);
		System.out.println(bo4);
		
		boolean bo5=doc2.equals(doc);
		System.out.println(bo5);
		
		boolean bo6=doc3.equals(doc2);
		System.out.println(bo6);
		
		
		
		
	}

}
