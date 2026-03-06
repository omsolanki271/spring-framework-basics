package com.springcore.coupling.loose;

public class LooseCopulingTest {

	public static void main(String[] args) {
		
		UserDataProvider dataProvider = new UserDatabaseProvider();
		UserManager manager = new UserManager(dataProvider);
		System.out.println(manager.UserInfo());
		
		UserDataProvider dataProvider2 = new WebServicesDataProvider();
		UserManager manager2 = new UserManager(dataProvider2);
		System.out.println(manager2.UserInfo());
	}

}
