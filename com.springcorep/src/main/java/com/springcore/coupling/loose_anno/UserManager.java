package com.springcore.coupling.loose_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
	
	private UserDataProvider dataProvider;

	@Autowired
	public UserManager(@Qualifier("UserDtPro") UserDataProvider dataProvider) {
		super();
		this.dataProvider = dataProvider;
	}
	
	public String UserInfo()
	{
		return dataProvider.getUserDetail();
	}
	
}
