import java.util.Arrays;
import java.util.TreeSet;

public class DuplicatesInAnArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,20,20,20,20,20,17,17,20};
		Arrays.sort(arr);
		TreeSet<Integer> dupArraySet = new TreeSet<Integer>();

		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				dupArraySet.add(arr[i]);
			}
		}
		
		for (Integer integer : dupArraySet) {
			System.out.println("The Duplicate items are : "+integer);
		}
	}
}