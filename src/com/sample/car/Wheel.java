package com.sample.car;

/*
 * This is Wheel class which extends Carpart
 */
public class Wheel extends CarPart {

	private float diameter;
	private int tirePressure;
	
	//default constructor
	public Wheel() {
		super();
	}

	//Parameterized Constructor
	public Wheel(float diameter, int tirePressure) {
		super();
		this.diameter = diameter;
		this.tirePressure = tirePressure;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public int getTirePressure() {
		return tirePressure;
	}

	public void setTirePressure(int tirePressure) {
		this.tirePressure = tirePressure;
	}
	
	@Override
	public void function() {
		System.out.println("processing inside Wheel Class. ");
		System.out.println("Diameter of the Wheel : " + getDiameter());
		System.out.println("Tire Pressure of the Wheel  : " + getTirePressure());
		
	}
	
}
