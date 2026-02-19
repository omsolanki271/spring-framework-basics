package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Product {
	private List<String> item;
	private Map<String,Integer> price;
	private Properties properties;

	public List<String> getItem() {
		return item;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}

	public Map<String, Integer> getPrice() {
		return price;
	}

	public void setPrice(Map<String, Integer> price) {
		this.price = price;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Product [item=" + item + ", price=" + price + ", properties value =" + properties + "]";
	}
	
}
