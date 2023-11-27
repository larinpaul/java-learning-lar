package quicksort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] numbers = new int[1000000]; // but at 100,000,000 we would hit a StackOverflow because of recursion...
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10000);
		}
		
		System.out.println("Before:");
		
		printArray(numbers);
		
		quicksort(numbers, 0, numbers.length - 1);
		
		System.out.println("\nAfter:");
		printArray(numbers);
		
		// Now with an overloaded method
		
		Random rand1 = new Random();
		int[] numbers1 = new int[10];
		
		for (int i = 0; i < numbers1.length; i++) {
			numbers1[i] = rand1.nextInt(100);
		}
		
		System.out.println("Before:");
		
		printArray(numbers1);
		
		quicksort(numbers1);
		
		System.out.println("\nAfter:");
		printArray(numbers1);

	}
	
	// Overloading the method
	private static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}
	
	private static void quicksort(int[] array, int lowIndex, int highIndex) {
		
		if (lowIndex >= highIndex) {
			return;
		}
		
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);
		
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		
		quicksort(array, lowIndex, leftPointer - 1);
		quicksort(array, leftPointer + 1, highIndex);	
	}

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while (leftPointer < rightPointer) {
			
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			swap(array, leftPointer, rightPointer);			
		}
			
		swap(array, leftPointer, highIndex);
		return leftPointer;
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
