package com.springcore.constructor_inj;

import java.util.List;

public class Person {
	private String name;
	private int personid;
	private Certi obj;
	private List<String> phones;

	
	public Person(String name ,int personid,Certi obj ,List<String> phones)
	{
		this.name = name;
		this.personid = personid;
		this.obj = obj;
		this.phones = phones;
	}


	

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", personid=" + this.personid + ", Certificate=" + this.obj.name + ", phones=" + phones + "]";
	}

	

	
	
	
	
}
