package com.sample.car;

import java.util.ArrayList;

/*
 * This is Car class which Integrates the various Car Parts Objects
 */
public class Car {

	private ArrayList<CarPart> carPartList;

	//Default Constructor
	public Car() {

		carPartList = new ArrayList<CarPart>();
		
		CarPart enginePart = new Engine(6, 2000);
		carPartList.add(enginePart);
		
		CarPart wheelpart = new Wheel(16, 32);
		carPartList.add(wheelpart);
		
		CarPart fuelTankpart = new FuelTank(50, 1000);
		carPartList.add(fuelTankpart);
	}

	public ArrayList<CarPart> getCarPartList() {
		return carPartList;
	}

	public void setCarPartList(ArrayList<CarPart> carPartList) {
		this.carPartList = carPartList;
	}
	
	public void run() {
		
		int carPartListSize = carPartList.size();
		
		for(int i=0; i<carPartListSize; i++) {
			
			CarPart carPart = carPartList.get(i);
			carPart.function();
		}
		
	}

	
}
