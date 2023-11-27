package nullpointerexception;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.makeNoise(); // Meow!
		
//		Cat myCat0 = null;
// 		myCat0.makeNoise(); // Null pointer exception
 		
		
 		Boolean shouldPrintHello = true;
 		
 		if (shouldPrintHello) {
 			System.out.println("Hello");
 		}

 		
// 		Boolean shouldPrintHelloNull = null;
// 		
// 		if (shouldPrintHello) {
// 			System.out.println("Hello"); // NPA!
// 		}
		
 		
// 		List<String> favoriteCheeseburgers = null; // Better not to do that!
 		List<String> favoriteCheeseburgers = new ArrayList();
 		
 		for (String burger : favoriteCheeseburgers) {
 			System.out.println(burger);
 		}
 		
 		
 		// Starting with Java 14, the NPA Error message is very helpful :)
 		
 		
 		// What if there could be a null? Well, time to perform a null check! :)
 		Cat myCatNull = null;
 		if (myCat != null) {
 			myCat.makeNoise();
 		}
 		
 		
// 		List<Cat> cats = new ArrayList<>();
// 		Cat myOtherCat = new Cat();
// 		myOtherCat.setName(null);
 		
// 		if (myOtherCat.getName().equals("Newman")) { // NPE!
// 			System.out.println("Hello, Newman");
// 		} 
// 		cats.add(myOtherCat);
// 	
// 		System.out.println(getFirstCatNameLength(cats));
 		
// 		if ("Newman".equals(myOtherCat.getName())) {
// 			System.out.println("Hello, Newman");
// 		}
// 		cats.add(myOtherCat);
// 		
// 		System.out.println(getFirstCatNameLength(cats));
 		
	}

//	// Earlier, something like that was very difficult to debug:
//	private static int getFirstCatNameLength(List<Cat> cats) {
//		return cats.get(0).getName().length(); // Error, because the return value of Cat.getName() is null
//	}
	
//	// Null check when there are many things on one line...
//	private static int getFirstCatNameLength(List<Cat> cats) {
//		
//		if (cats != null &&
//			cats.get(0) != null &&
//			cats.get(0).getName() != null) {
//				return cats.get(0).getName().length();
//			}
//		return 0;
//		
//	}
	
	private static List<Cat> getCats() {
		
//		return null; // Better not!
		return new ArrayList();
		
	}
	
}
