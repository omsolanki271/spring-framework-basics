package com.springcore.coupling.tight;

public class UserManager {
	private UserDatabase database = new UserDatabase();
	
	public String getUserInfo()
	{
		return database.getUserDetails();
	}
}
