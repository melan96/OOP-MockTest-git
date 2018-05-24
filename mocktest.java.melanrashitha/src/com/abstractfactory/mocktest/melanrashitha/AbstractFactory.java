package com.abstractfactory.mocktest.melanrashitha;

public class AbstractFactory{

	public  MobilePhone getMobile(String mobileModel){

		if(mobileModel.equals("A10")){
			return new A10();
		}
		else if(mobileModel.equals("X25")){
			return new X25();
		}
		else if(mobileModel.equals("TPlus")){
			return new TPlus();
		}else {
			return null;
		}

	}

	public  TV getTV(String tvModel){
		
		if(tvModel.equals("alpha40")){ 
			return new Alpha40();
		}
		if(tvModel.equals("Gamma50")){ 
			return new Gamma50();
		}
		if(tvModel.equals("Theta65")){ 
			return new Theta65();
		}else {
			return null;
		}

	}


}
