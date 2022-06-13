package week1.day2;

public class CarClass {
	
	public void applyBrake() {
		System.out.println("The Brakes are applied!!");
	}
	
	public void turnOnIgnition() {
		System.out.println("Ignition ON!!");
	}
	
	public void crankTheVehicle() {
		System.out.println("Cranking the Vehicle!!");
	}
	
	public void accelerate() {
		System.out.println("Stepping on the Accelarator!!");
	}
	
	public void turnOnIndicators() {
		System.out.println("Indicators Switched On!!");
	}

	
	public static void main(String[] args) {
		CarClass objForCar = new CarClass();
		
		objForCar.turnOnIgnition();
		objForCar.crankTheVehicle();
		objForCar.accelerate();
		objForCar.turnOnIndicators();
		objForCar.applyBrake();
	}
}
