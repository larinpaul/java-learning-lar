package javagenerics;

import java.util.List;

import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {

		System.out.println("Hello, this is out Java Generics lesson!");
		
		IntegerPrinter printer = new IntegerPrinter(23);
		printer.print();
		
		Printer<Integer> genericPrinter = new Printer<>(223);
		genericPrinter.print();
		
		Printer<String> stringPrinter = new Printer<>("Hello!");
		stringPrinter.print();
		
//		ArrayList<Cat> cats = new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Dog()); // error
		
//		// Dangerous! Not type safe!
//		ArrayList<Object> cats = new ArrayList<>();
//		cats.add(new Cat());
//		
//		Cat myCat = (Cat)cats.get(0); // Cannot convert from Object to Cat!	

		shout("John");
		shout(11);
	
		shoutTwice("Gabriel", 13141);
		
		String myReturnedString = shoutWithReturn("Peter", "135531");
		System.out.println(myReturnedString + " is the first thing!");
		
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		printList(intList);
		
		List<List<Integer>> matrixList = new ArrayList<>();
		matrixList.add(intList);
		printList(matrixList);
		
	}
	
	private static <T> void shout(T thingToShout) {
		System.out.println(thingToShout + "!!!!!");
	}
	
	private static <T, V> void shoutTwice(T thingToShout, V otherThingToShout) {
		System.out.println(thingToShout + "!!!!!" + otherThingToShout + "!!!!!!!");
	}
	
	private static <T, V> T shoutWithReturn(T thingToShout, V otherThingToShout) {
		System.out.println(thingToShout + "!!!!!" + otherThingToShout + "!!!!!!!");
		return thingToShout;
	}
	
	//// Working with Wildcard	
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}
	
//	/// You can also have bounded wildcards
//	private static void printList(List<? extends Animal> myList) {
//		System.out.println();
//	}
	
}
