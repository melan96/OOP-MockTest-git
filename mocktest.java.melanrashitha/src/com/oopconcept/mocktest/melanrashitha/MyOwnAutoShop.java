package com.oopconcept.mocktest.melanrashitha;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Car car= new Car(250,2500000,"Black") {};
		Bus bus = new Bus(150,6500000,"White",2016,250000);
		
		//display car price
		System.out.println("Car Price  : "+car.getSalePrice());
	
		//display Bus price
		System.out.println("Bus Price  : "+bus.getSalePrice());
	}
}
