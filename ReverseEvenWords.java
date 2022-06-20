package assignments;

import java.util.Collections;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester"; 
		String[] splittedString = test.split(" ");
		String newReversedString = "";

		for (int i = 0; i < splittedString.length; i++) {
			if(i%2 != 0) {
				String temp = splittedString[i];
				StringBuffer reverse = new StringBuffer(temp).reverse();
				newReversedString = newReversedString + reverse;
			} else {
				newReversedString = newReversedString + splittedString[i];
			} 
			newReversedString = newReversedString + " ";
		}  
		System.out.println(newReversedString);
	}
}