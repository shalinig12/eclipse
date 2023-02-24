package com.xworkz.exception.event;

public class Engineer extends Person {
	
	public Engineer() {
		System.out.println("no arg constructor in engineer");
	}
	
	public Engineer(int id, String name, String email, int age) {
		super(id,name,email,age);
		System.out.println("super chaining in engineer");
	}
	
	public Engineer(int id, String name, String email) {
		super(id,name,email);
		System.out.println("super chaining in engineer");
	}
	
	public Engineer(int id, String name) {
		super(id,name);
		System.out.println("super chaining in engineer");
	}
	
	@Override
	public String toString() {
		
		return "[id" +this.id+ "][name" +this.name+ "][email" +this.email+ "][age" +this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running in object");
		if(obj !=null) {
			System.out.println("object is engineer");
			if(obj instanceof Person) {
				Engineer casted=(Engineer)obj;
				Engineer left=this;
				Engineer right=casted;
				if(left.id==right.id && left.name.equals(right.name)&& left.email.equals(right.email) && left.age==right.age) {
				System.out.println("left is equal to right");
				return true;
				
				}else {
					System.out.println("left is not equal to right");
				}
				
			}else {
				System.out.println("obj is not person");
			}
		}else {
			System.out.println("obj is null");
		}
		
		return super.equals(obj);
	}
		
		@Override
		public int hashCode() {
			return 234;
		}
	}
		
	
	
	
	
	
	
	


