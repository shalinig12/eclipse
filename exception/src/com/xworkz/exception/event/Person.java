package com.xworkz.exception.event;

public class Person {
	public int id;
	public String name;
	public int age;
	public String email;

	public Person() {
		System.out.println("no arg constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, String email) {
		this(id, name);
		this.email = email;
	}

	public Person(int id, String name, String email, int age) {
		this(id, name, email);
		this.age = age;
	}

}
