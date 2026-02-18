package com.springcore.auto.wire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	 ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/auto/wire/xml/auto_config.xml");
	 Emp e1 = context.getBean("Emp1",Emp.class); // other way to type cast
	 System.out.println(e1);
	 
	}

}

