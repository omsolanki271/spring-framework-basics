package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//default take object name student
//	@Component
//give other object name 
@Component("obj")
public class Student {
	@Value("Om Solanki")
	private String sname;
	@Value("Bhanvad")
	private String city;
	
	public String getSname()
	{
		return this.sname;
	}
	
	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", city=" + city + "]";
	}	
	
}

