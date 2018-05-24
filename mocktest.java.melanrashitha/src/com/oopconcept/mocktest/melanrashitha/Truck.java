package com.oopconcept.mocktest.melanrashitha;

public class Truck extends Car{
	
	private int weight;

	public Truck(int speed, double regularPrice, String colour,int weight) {
		super(speed, regularPrice, colour);
		this.weight=weight;
		
	}

	@Override
	public double getSalePrice() {
		
		if(this.weight > 2000) {
		return (this.getSalePrice()+this.getSalePrice() * 10 / 100);
		}else {
			return (this.getSalePrice()+this.getSalePrice() * 20 / 100);
		}
	}
	
	
	
	

}
