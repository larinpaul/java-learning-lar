package binarysearch;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] ints = {1, 2, 4, 5, 7, 9, 11};
		System.out.println(binarySearch(ints, 9)); // 5
		System.out.println(binarySearch(ints, 8)); // -1
		System.out.println(binarySearch(ints, 11)); // 6
		
		System.out.println(Arrays.binarySearch(ints, 11)); // 6
		System.out.println(Arrays.binarySearch(ints, 6)); // -5 ?? why not -1 though
		
	}
	
	private static int binarySearch(int[] numbers, int numberToFind) {
		int low = 0;
		int high = numbers.length - 1;
		
		// You could also change it form being a while loop to being a recursive algorithm.
		while (low <= high) {
			int middlePosition = (low + high) / 2;
			int middleNumber = numbers[middlePosition];
			
			if (numberToFind == middleNumber) {
				return middlePosition;
			}
			if (numberToFind < middleNumber) {
				high = middlePosition - 1;
			} else {
				low = middlePosition + 1;
			}
		}
		return -1;
		
	}

}
