package week1.day1;

public class LearnJavaAssignment {

	public static void main(String[] args) {
		int initialNumber = 0;
		int secondInitialNumber = 1;
		int rangeRequired = 10;
		int sum = 0;
		
		System.out.println(initialNumber);
				System.out.println(secondInitialNumber);

		for (int i = 1 ; i < rangeRequired; i++) {
			sum = initialNumber + secondInitialNumber;
			System.out.println(sum);
			initialNumber = secondInitialNumber;
			secondInitialNumber = sum;
		}
	}
}