package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("obj")
public class Student {
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	public Student(Address add) {
		super();
		this.add = add;
	}

	public void study() {
		this.add.display();  // ?
		System.out.println("Student study.....");
	}
}
