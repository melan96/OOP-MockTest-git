package com.oopconcept.mocktest.melanrashitha;

public abstract class Car {
	
	private int speed;
	private double regularPrice;
	private String colour;
	
	
	public Car(int speed, double regularPrice, String colour) {
		
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
	}

	public Car(int speed,String colour) {
		this.speed=speed;
		this.colour=colour;
	}
	
	public double getSalePrice() {
		return this.regularPrice;
	}
}
