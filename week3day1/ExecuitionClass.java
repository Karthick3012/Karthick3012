package week3day1;

public class ExecuitionClass {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.accelerate();
		c.applyBrake();
		c.closeDoor();
		c.driveVehicle();
		c.enableAirbag();
		c.filFuel();
		c.shiftGear();
		System.out.println("Wheel of the car is:"+c.wheelCar);
		
		Bajaj a = new Bajaj();
		System.out.println("Wheel of the auto is:"+a.wheelAuto);
		
		Audi A = new Audi();
		A.shiftGear();

	}

}