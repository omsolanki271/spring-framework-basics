package com.springcore.constructor_inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/constructor_inj/ci_config.xml");
	Person p = (Person)context.getBean("cinj");
	System.out.println(p);
	
	Addition add = (Addition)context.getBean("abiguty");
	add.doSum();
	}

}
