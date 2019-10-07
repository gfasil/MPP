package Assignments.lesson5.Question3;

public class VehicleFactory {
	
	enum vehicle {bus,car,truck,electric
		};
	
	private VehicleFactory() {}
	
	
	public static Vehicle getVehicle(String vname) {
		
		
		
		if(vname==vehicle.car.toString()) {
			return new Car();
			
		}
		if(vname.equalsIgnoreCase("truck")) {
			return new Truck();
			
		}
		if(vname.equalsIgnoreCase("bus")) {
			return new Bus();
			
		}
		else{
			return new ElectricCar();
			
		}
		
	}

}
