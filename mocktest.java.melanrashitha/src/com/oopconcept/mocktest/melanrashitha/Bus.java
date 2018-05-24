package com.oopconcept.mocktest.melanrashitha;

public class Bus extends Car {
	
	private int year;
	private double manufacturerDiscount;
	
	public Bus(int speed, double regularPrice, String colour,int year,double manufacturerDiscount) {
		super(speed, regularPrice, colour);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
		
	}

	@Override
	public double getSalePrice() {
		
		return super.getSalePrice()-manufacturerDiscount;
	}
	
	

}
