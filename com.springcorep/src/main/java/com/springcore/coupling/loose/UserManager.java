package com.springcore.coupling.loose;

public class UserManager {
	private UserDataProvider dataProvider;

	public UserManager(UserDataProvider dataProvider) {
		super();
		this.dataProvider = dataProvider;
	}
	
	public String UserInfo()
	{
		return dataProvider.getUserDetail();
	}
	
}
