package com.springcore.setter_inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) context.getBean("student1",Student.class);
		System.out.println(student);
		Student student2 = (Student) context.getBean("student2",Student.class);
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("student3",Student.class);
		System.out.println(student3);
		
	}

}
