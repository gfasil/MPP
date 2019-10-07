package Assignments.lesson5.Question3TestPackage;

import Assignments.lesson5.Question3.Vehicle;
import Assignments.lesson5.Question3.VehicleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car=VehicleFactory.getVehicle("car");
		car.startEngine();
		Vehicle truck=VehicleFactory.getVehicle("truck");
		truck.startEngine();
		Vehicle elec=VehicleFactory.getVehicle("electric car");
		elec.startEngine();
		Vehicle bus=VehicleFactory.getVehicle("bus");
		bus.startEngine();
	}

}
