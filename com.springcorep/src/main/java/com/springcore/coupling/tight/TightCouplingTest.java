package com.springcore.coupling.tight;

public class TightCouplingTest {

	public static void main(String[] args) {
		UserManager manager = new UserManager();
		System.out.println(manager.getUserInfo());
	}
}
