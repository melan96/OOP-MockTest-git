package com.singleton.mocktest.melanrashitha;

public class LoginMain {

	public static void main(String[] args) {
	Login obj1 = Login.getInstance();
	Login obj2 = Login.getInstance();
	
	obj1.validateUser("Manju", "Manju");
	
	}
	
	
	
}
