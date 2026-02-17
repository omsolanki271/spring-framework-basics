package com.springcore.lijfecycle;

public class Product {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init mehtod call....");
	}
	
	public void destory()
	{
		System.out.println("Inside destory method call...");
	}
	
}
