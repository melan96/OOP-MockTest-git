package com.abstractfactory.mocktest.melanrashitha;

public class FactoryDemo {
	
public static void main(String[] args){
		
		AbstractFactory obj = new AbstractFactory();
		
		
		//get gamma50 TV
		TV gammaTv = obj.getTV("Gamma50");
		gammaTv.display();

		//get Mobile Phone
		MobilePhone mobilePhone = obj.getMobile("X25");
		mobilePhone.display();

	}

}
