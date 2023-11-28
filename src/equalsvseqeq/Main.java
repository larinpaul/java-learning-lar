package equalsvseqeq;

public class Main {

	public static void main(String[] args) {

		int int1 = 3;
		int int2 = 3;
	
		// Primitive variables refer to their values
		if (int1 == int2) {
			System.out.println("The numbers are equal"); // This will be printed out
		}
		else {
			System.out.println("The numbers are not equal");
		}
		
		String string1 = new String("Hello :)");
		String string2 = new String("Hello :)");
		
		// Object variables refer to their memory locations
		if (string1 == string2) {
			System.out.println("The strings are equal");
		}
		else {
			System.out.println("The strings are not equal"); // This will be printed out
		}
		// They are not equal because java compared their memory locations and not their values
		
		if (string1.equals(string2)) {
			System.out.println("The strings are equal"); // This will be printed out
		}
		else {
			System.out.println("The strings are not equal"); 
		}
		
		
		// AND IF WE WILL USE STRING LITERALS!
		String string3 = "1";
		String string4 = "1";
		if (string3.equals(string4)) {
			System.out.println("The string literals are equal"); // This will be printed out
		}
		else {
			System.out.println("The string literals are not equal"); 
		}
		
		Dog myDog = new Dog();
		Dog yourDog = new Dog();
		// By the way, if you don't implement the .equals method in your class, it's just as bad as using the ==
		if (string1.equals(string2)) {
			System.out.println("The dogs are equal"); // This will be printed out
		}
		else {
			System.out.println("The dogs are not equal"); 
		}
		
		
		
		

	}

}
