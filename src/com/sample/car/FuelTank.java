package com.sample.car;

/*
 * This is Fuel tank Class which extends Carpart Class
 */
public class FuelTank extends CarPart {

	private int tankSize;
	private float price;
	
	//default constructor
	public FuelTank() {

	}

	//Parameterized Constructor
	public FuelTank(int tankSize, float price) {
		super();
		this.tankSize = tankSize;
		this.price = price;
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public void function() {
		System.out.println("processing inside FuelTank Class. ");
		System.out.println("Tank Size of the Fuel Tank  : " + getTankSize());
		System.out.println("Price of the Fuel Tank : " + getPrice());
		
	}
}
