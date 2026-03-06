package com.springcore.coupling.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/coupling/loose/config.xml");
		UserManager manager = context.getBean("UsermgDb",UserManager.class);
		System.out.println(manager.UserInfo());
		
		UserManager manager2 = (UserManager) context.getBean("UserwebSer");
		System.out.println(manager2.UserInfo());
	}

}
