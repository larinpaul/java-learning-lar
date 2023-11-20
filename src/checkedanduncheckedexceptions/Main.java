package checkedanduncheckedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) /* throws FileNotFoundException */ {

		// By the way, Error is usually for things from which you CAN'T RECOVER, like out of memory error...
		// But you can recover from an Exception :)
		
		// What is the difference between a checked and an unchecked exception?
		
		// Well, a checked exception one that is checked for at compile time
		// by either using try catch or adding the throws declaration to the method signature
		readFile("myFile.txt");
		// If the FileNotFound were an unchecked exception, we wouldn't've been getting that error....

//		readFileWithThrows("myFile.txt"); // If we would "throws" in the main(), it will just cause the program not to run at all...
		try {
			readFileWithThrows("myFile.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//// Now for the UNCHECKED exceptions
				
		String name = null;
//		printLength(name); // NullPointerException is an unchecked exception, SO IT JUST THROWS EVERYWHERE
		printLengthWithTryCatch(name); // Now this one was caught :)
		
		System.out.println("This still runs! Yay! :)");
			
	}

	private static void readFile(String fileName) {
		try {
			FileReader reader = new FileReader(fileName);
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("Hey, that file doesn't exist! :)");
			fnfe.printStackTrace();
			System.out.println("Hey, that file doesn't exist! :)");
		}
	}
	
	// And how to deal with it by using throws:
	private static void readFileWithThrows(String fileName) throws FileNotFoundException {
		FileReader reader = new FileReader(fileName);
	}
	
	
	//// Now for the UNCHECKED exceptions
	//// In Java, all RuntimeException and its subclasses are unchecked exception! :o, for example:
	// NullPointerException
	// NumberFormatException
	// ClassCastException
	// IndexOutOfBoundsException
	// ...
	//// All the other exceptions are checked, for example:
	// IOException
	// SQLException
	// MalformedURLException
	// ...
	
	private static void printLength(String myString) {
		System.out.println(myString.length());
	}
	
	// You could probably (and it would be better this way) to add try/catch even around this unchecked exception...
	private static void printLengthWithTryCatch(String myString) {
		try {
			System.out.println(myString.length());
		}
		catch (NullPointerException npe) {
			System.out.println("Uh-oh! An NPE!");
		}
	}
	
	
	//// To see the difference between Exception and RuntimeException:
	
	private static void throwException(String myString) { // Checked exceptions
//		throw new Exception(); // You can't even compile it because it's a checked exception
	}
	
	private static void throwRuntimeException(String myString) { // Unchecked exceptions
		throw new RuntimeException(); // You can compile it but it can lead to an unexpected runtime exception
	}
	
	
}
