package com.springcore.coupling.loose_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LooseCopulingTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserManager manager = context.getBean(UserManager.class);
		System.out.println(manager.UserInfo());
		
	}

}
