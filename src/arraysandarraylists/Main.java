package arraysandarraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] friendsArray = new String[4];
		
		String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"};
		
		for (String i : friendsArray2) {
			System.out.println(i);
		}
		
		System.out.println("Now let's experiment with ArrayList");
		
		ArrayList<String> friendsArrayList = new ArrayList<>();

		ArrayList<String> friendsArrayList2 =
				new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
		
		for (String i : friendsArrayList2) {
			System.out.println(i);
		}
		
		System.out.println("Now let's work with Integer ArrayList");
		
		ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3));

		for (Integer i : integerArrayList) {
			System.out.println(i);
		}
		
		// Get element
		System.out.println(friendsArray2[1]); // Chris
		System.out.println(friendsArrayList2.get(1));
		
		// GEt size
		System.out.println(friendsArray2.length); // 4
		System.out.println(friendsArrayList2.size()); // 4
		
		// Arrays - Can't add an element to the end of the array
		// due to it having a fixed size
		// You can't do that with Arrays :(
		
		// But you can do it with ArrayLists! :)
		// Add an element
		friendsArrayList2.add("Mitch");
		System.out.println(friendsArrayList2.get(4));
		
		// Set an element
		friendsArray2[0] = "Carl";
		System.out.println(friendsArray2[0]);
		friendsArrayList2.set(0, "Carl as well");
		System.out.println(friendsArrayList2.get(0));
		
		// Remove an element
		// Can't do this with Arrays!
		System.out.println(friendsArrayList2.get(0));
		friendsArrayList2.remove(0);
		System.out.println(friendsArrayList2.get(0));

		// Prints
		System.out.println(friendsArray2); // [Ljava.lang.String;@2c8d66b2
		System.out.println(friendsArrayList2); // [Chris, Eric, Luke, Mitch]

	}

}
