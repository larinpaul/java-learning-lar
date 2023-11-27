package varlocalvariabletypeinference;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("We can use var to infer the type of a local variable");
		// https://www.youtube.com/watch?v=2zXbRJty4vc
		
		// Java is a statically-typed programming language.
		// But we can use var to use the process of local variable type inference

		// You can do something like this
		// (for local variables only, not for instance variables!)
		// This is because we don't store the variables inside the method,
		// but we do store the instance variables ??? (Aren't these instance variables anyway?)
		// Ah, I guess he meant YOU CAN'T USE VAR FOR THE FIELDS...
		ArrayList obj1 = new ArrayList();
		var obj2 = new ArrayList(Arrays.asList("Hey", "There"));
		
		int a1 = 9;
		var a2 = 99;
		 
		int c;
//		var d; // this won't work
		var d = 10; // this will work
		System.out.println(d); // 10
		
		int nums1[] = new int[1];
		int[] nums2 = new int[2];
		var nums3 = new int[3];
//		var nums4[] = new int[4]; // This won't work
		
		Alien alien1 = new Alien();
		var alien2 = new Alien();
	
	}

}
