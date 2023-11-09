package lambdaexpressions;

public class Lambdas {

	public static void main(String[] args) {

////		Cat myCat = new Cat();
////		myCat.print(); // Instead of doing this, we can do this:
////		printThing(myCat); 
//		printThing(
//				() -> {
//					System.out.println("Meow");
//				}
//				
//		);
//		printThing(() -> System.out.println("Meow Meow!"));
//		
//		Printable lambdaPrintable = () -> System.out.println("Meow Meow Meow!");
//		printThing(lambdaPrintable);
//		
//		// Lambdas in Java give you the ability to make
//		// method implemenations into objects like any other.
//		// They can be saved into variables and passed into methods as parameters

//							// you can exclude () if it's not zero parameters or more than one parameter (l, s) etc...
//		Printable lambdaPrintable = (p, s) -> System.out.println(p + "Meow" + s);
//		printThing(lambdaPrintable);

		
		Printable lambdaPrintable = (s) -> {
			return "Meow" + s;
		};
		printThing(lambdaPrintable);
		
		Printable lambdaPrintable1 = (s) -> "Meow " + s;
		printThing(lambdaPrintable1);
		/// Dunno man, didn't seem to work... Gotta learn more about Lambdas!
		
		// A Lambda is a shortcut to defining an implementation
		// of a functional interface
		// For example, instead of creating a class Cat
		// to implement print() method from the Printable interface,
		// we can just use a lambda expression
		
	}
	
	static void printThing(Printable thing) {
//		thing.print("#", "!");
		
		thing.print("!");
		
	}

}
