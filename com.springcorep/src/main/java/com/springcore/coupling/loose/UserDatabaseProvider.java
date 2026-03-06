package com.springcore.coupling.loose;

//1 database Provider 
public class UserDatabaseProvider implements UserDataProvider {

	@Override
	public String getUserDetail() {
		return "User Details From Database";
	}

}
