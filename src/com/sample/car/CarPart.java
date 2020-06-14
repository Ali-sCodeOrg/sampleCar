package com.sample.car;

/*
 * This is Carpart class. 
 * Different parts like Engine, Wheels etc will Extend this class
 */
public class CarPart implements FunctionalCarInterface{

	//this is condition varible, which can have values from 1 to 100.
	private int condition;
	
	//Default constructor of carpart Class
	public CarPart() {

	}
	
	//Parameterized Constructor of Carpart class
	public CarPart(int condition) {
		super();
		this.condition = condition;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	/**
	 * this method prints the status of the car part condition 
	 */
	public void status() {
		
		System.out.println("Condition of the Car Part is " + this.condition);
	}


	@Override
	public void function() {
		System.out.println("processing inside Super Class Carpart Class.function method ");
		
	}
	
	
}
