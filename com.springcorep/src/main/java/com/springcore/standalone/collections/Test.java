package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone_config.xml");
		Product product =  context.getBean("pitem",Product.class);
		System.out.println("===============All field print here==================");
		System.out.println(product);
		System.out.println("----------------only show item useing list-------");
		System.out.println(product.getItem());
		System.out.println(product.getItem().getClass().getName());
		System.out.println("----------------only show item  + price useing map-------");
		System.out.println(product.getPrice());
		System.out.println(product.getPrice().getClass().getName());
		System.out.println("----------------only show DB connection useing Properties --------------");
		System.out.println(product.getProperties());
		System.out.println(product.getProperties().getClass().getName());
	}

}
