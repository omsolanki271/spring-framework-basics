package com.springcore.lijfecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lijfecycle/life_config.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lijfecycle/life_config.xml");
		Product item = (Product)context.getBean("p1");
		System.out.println(item);
		//use for destory() method call taht avaiable in AbstractApp class
		context.registerShutdownHook();
		
	}

}
