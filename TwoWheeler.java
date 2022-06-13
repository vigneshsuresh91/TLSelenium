package week1.day2;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 23836946191383380L;
	boolean isPunctured = false;
	String bikeName = new String("Activa");
	double runningKM = 230000.62321;
	
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		
		System.out.println("Name of the Vehicle  : "+obj.bikeName);
		System.out.println("No of Wheels  : "+obj.noOfWheels);
		System.out.println("No of Mirrors  : "+obj.noOfMirrors);
		System.out.println("Chassis Number : "+obj.chassisNumber);
		System.out.println("Is the Vehicle Punctured  : "+obj.isPunctured);
		System.out.println("Total Kilometers Run By the Vehicle  : "+obj.runningKM);
	}
}