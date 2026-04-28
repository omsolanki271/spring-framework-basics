package com.springcore.lijfecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lijfecycle/life_config.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lijfecycle/life_config.xml");
		//use for destory() method call taht avaiable in AbstractApp class
		context.registerShutdownHook();
		System.out.println("++++++++++++ 1 Using XML ++++++++++++++");
		Product item = (Product)context.getBean("p1");
		System.out.println(item);
		System.out.println("++++++++++++ 2 Using Interface ++++++++++++++");
		Product2 item2= (Product2) context.getBean("p2");
		System.out.println(item2);
		System.out.println("++++++++++++ 3 Using Annotation ++++++++++++++");
		Product3 item3= (Product3) context.getBean("p3");
		System.out.println(item3);
		
	}

}
