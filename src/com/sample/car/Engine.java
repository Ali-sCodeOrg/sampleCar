package com.sample.car;

/*
 * This is Engine Class which extends CarPart Class
 */
public class Engine extends CarPart {
	
	private int numberOfCylinder;
	private double price;
	
	//Default Constructor
	public Engine() {

	}

	//Parameterized Constructor
	public Engine(int numberOfCylinder, double price) {
		super();
		this.numberOfCylinder = numberOfCylinder;
		this.price = price;
	}

	public int getNumberOfCylinder() {
		return numberOfCylinder;
	}

	public void setNumberOfCylinder(int numberOfCylinder) {
		this.numberOfCylinder = numberOfCylinder;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public void function() {
		System.out.println("processing inside Engine Class. ");
		System.out.println("Number Of Cylinder in the Engine : " + getNumberOfCylinder());
		System.out.println("Price of the Engine : " + getPrice());
		
	}
	
	

}
