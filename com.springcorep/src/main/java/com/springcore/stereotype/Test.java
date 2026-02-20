package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student stud =  context.getBean("obj",Student.class);
		System.out.println(stud);
		System.out.println(stud.getAddress());
		System.out.println(stud.getAddress().getClass().getName());
		
		// check for scope use here Annotaion
		Student stud2 =  context.getBean("obj",Student.class);
		System.out.println(stud.hashCode());
		System.out.println(stud2.hashCode());
		
		System.out.println("=============================");
		Teacher t = context.getBean("teacher",Teacher.class);
		Teacher t1 = context.getBean("teacher",Teacher.class);
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		
		
	}

}
