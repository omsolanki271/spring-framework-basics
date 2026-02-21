package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//first way with xml 		
//		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		//second way to use javaconfig file .class
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student stud = (Student) context.getBean("obj",Student.class);
		
		// third way to use @Bean annotation 
		Student stud = (Student) context.getBean("sub1",Student.class);
		System.out.println(stud);
		stud.study();

	}

}
