package com.singleton.mocktest.melanrashitha;

public class Login {

	//singleton design pattern 
	public static Login login;
	
	private Login() {}
	
	public static Login getInstance() {
		if(login==null) {
			 login=new Login();
		}
		return login;
	}
	
	public boolean validateUser(String user,String password) {
		if(user.equals("") &&password.equals("") ) {
			return true;
		}else {
			return false;
		}
	}
}
