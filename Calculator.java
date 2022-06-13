package week1.day2;

public class Calculator {

	public int addition(int addFirstNumber, int addSecondNumber) {
		int sum = addFirstNumber + addSecondNumber;
		return sum;
	}

	public float subtraction(float subFirstNumber, int subSecondNumber) {
		float subtractedValue;
		if(subFirstNumber > subSecondNumber) {
			subtractedValue = subFirstNumber - subSecondNumber;
		}else {
			subtractedValue = subSecondNumber - subFirstNumber ;
		}
		return subtractedValue;
	}

	public double multiplication(double mulFirstNumber, double mulSecondNumber, double mulThirdNumber) {
		double multipliedValue = mulFirstNumber * mulSecondNumber * mulThirdNumber;
		return multipliedValue;
	}

	public int divisionOfTwoNumbers(int divFirstNumber, int divSecondNumber) {
		int remiander;

		if(divFirstNumber > divSecondNumber) {
			remiander = divFirstNumber / divSecondNumber;
		}else {
			remiander = divSecondNumber / divFirstNumber ;
		}
		return remiander;
	}
}