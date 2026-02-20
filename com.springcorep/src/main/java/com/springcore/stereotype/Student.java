package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//default take object name student
//	@Component
//give other object name 
@Component("obj")
@Scope("prototype")
public class Student {
	@Value("Om Solanki")
	private String sname;
	@Value("Bhanvad")
	private String city;
	
	@Value("#{add}")
	private List<String> address;
	
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

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	
}

