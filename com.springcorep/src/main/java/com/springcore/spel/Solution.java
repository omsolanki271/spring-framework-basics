package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class Solution {

	// without value rung give 0 becasue call defualt constructor
	@Value("#{3+4}")
	private int x;
	@Value("#{2*4}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;

	@Value("#{T(java.lang.Math).PI}")
	private double e;

	@Value("#{new java.lang.String('om')}")
	private String name;
	
	@Value("#{('user'=='user')}")  // put something return true or false
	private boolean isActive;

	public int getX() {
		return x;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Solution [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	
}
