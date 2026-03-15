package com.springcore.coupling.loose_anno;

import org.springframework.stereotype.Component;

@Component("UserDtPro") 
public class UserDatabaseProvider implements UserDataProvider {

	@Override
	public String getUserDetail() {
		return "User Details From Database";
	}

}
