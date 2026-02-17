package com.springcore.lijfecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product3 {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product3() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("init method call for @annotation");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("destroy method call for @annotation");
	}
	
}
