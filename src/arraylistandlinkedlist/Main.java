package arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("John");
		namesLinkedList.add("Paul");
		namesLinkedList.add("George");
		namesLinkedList.add("Ringo");
		System.out.println(namesLinkedList.get(2)); // Slow... Faster to get 2 than 2222222 // George
		namesLinkedList.add(1, "Jerry");
		System.out.println(namesLinkedList.get(1)); // Faster to remove an arbitrary item // Jerry
		
		
		String[] names = new String[4];
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("John");
		namesArrayList.add("Paul");
		namesArrayList.add("George");
		namesArrayList.add("Ringo");
		System.out.println(namesArrayList.get(2)); // SUPER FAST, The same time to get 2 and 2222222 // George
		namesArrayList.add(1, "Jerry");
		System.out.println(namesArrayList.get(1)); // Slower to add and/or replace an item // Jerry
		
		
		// The difference comes from what they do behind the scenes
		
		
	}

}
