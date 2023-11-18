package finalkeyword;

public class Main {
	
	public static final double PI = 3.14159; // we can also make it private so it won't be accessible from anywhere else
	private static final double SECRET_CONSPIRACY_PI = 4;

	public static void main(String[] args) {
		
		// There are three ways to use the final keyword:
		// Final classes - Prevents a class from being extended (inherited from)
		// Final methods - Prevents a method from being overridden @Override 
		// Final variables - Prevents a variable
		
		Dog myDog = new Dog();
		myDog.eat(); // from Animal
		myDog.bark(); // from Dog
		
		// a final variable is a variable that you can assign ONLY ONE TIME
		final Dog myDogNamedSpot = new Dog();
		
		myDog = new Dog(); // possible
//		myDogNamedSpot = new Dog(); // impossible!
		
		// By the way, you can assign a variable on another line
		final Dog myDogNamedLupus;
		myDogNamedLupus = new Dog(); // possible
//		myDogNamedLupus = new Dog(); // impossible!
	
		
		// One of the most useful ways to use final is to create CONSTANTS
		final double INNER_PI = 3.14159266;
		System.out.println("Inner pi is " + INNER_PI);
//		pi = 9; // impossible!
		
		System.out.println("Standard Java PI is " + Math.PI);		
		
	}

}
