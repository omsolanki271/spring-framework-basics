package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/coll_config.xml");
		Emp emp = (Emp) context.getBean("EMP1");
		System.out.println(emp.getEname());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourses());
		System.out.println(emp.getAuthentication());
	}

}
