package com.springcore.coupling.loose_anno;

import org.springframework.stereotype.Component;

@Component("Userweb")
public class WebServicesDataProvider implements UserDataProvider{

	@Override
	public String getUserDetail() {
		// TODO Auto-generated method stub
		return "User Details from WebServices provider";
	}

}
