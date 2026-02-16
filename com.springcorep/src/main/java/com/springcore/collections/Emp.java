package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String ename;
	private List<String> phone;
	private Set<String> address;
	private Map<String,String> courses ;
	private Properties authentication;
	
	public Emp(String ename, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.ename = ename;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	
	public Emp(Properties authentication) {
		super();
		this.authentication = authentication;
	}
	
	public Emp() {
		super();
	}
	
	
	
	public Properties getAuthentication() {
		return authentication;
	}
	public void setAuthentication(Properties authentication) {
		this.authentication = authentication;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	
	
}
