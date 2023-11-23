package defaultstaticwellnotreallystaticmaybe;

interface Vehicle {
	
	String getBrand();
	
	String speedUp();
	
	String slowDown();
	
	default String turnAlarmOn() {
		return "turning vehicle alarm on";
	}
	
	default String turnAlarmOff() {
		return "turning vehicle off";
	}
}

class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public String speedUp() {
		return "the car is speeding up";
	}

	@Override
	public String slowDown() {
		return "the car is slowing down";
	}
	
	// And yeah, you could override them as well...
	@Override
	public String turnAlarmOff() {
		return "This car turns its alarm off";
	}
		
}

public class DefaultDemoe {

	public static void main(String args) {
		
		Vehicle vehicle = new Car();
//		Car vehicle = new Car(); // You can also define it like this
		vehicle.getBrand();
		vehicle.speedUp();
		vehicle.slowDown();
		
		vehicle.turnAlarmOff();
		vehicle.turnAlarmOn();
		
	}
	
}
