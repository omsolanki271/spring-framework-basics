package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//after bean use remove @Component with this annoation
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Address getAdd()
	{
		return new Address();
	}
	
	//simple bean call by getStudent
	
	//@Bean
	
	// othername to call
	@Bean(name = {"sub1","sub2","sub3"})
	public Student getStudent()
	{
		//Student student = new Student();
		Student student = new Student(getAdd());
		return student;
	}
}
