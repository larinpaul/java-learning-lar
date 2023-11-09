package lambdaexpressions;

@FunctionalInterface
public interface Printable {

//	void print();
	
//	void print(String prefix, String suffix);
	
	String print(String suffix);
	
	// If a method doesn't have an implementation, it's called an abstract method.
	// And when an interface has only one abstract method, it's called a functional interface
	// They are also called SAM interfaces,
	// because they have a Single Abstract Method
	// It can have static or default methods, but only one abstract method
	
	// A Lambda is a shortcut to defining an implementation
	// of a functional interface
	// For example, instead of creating a class Cat
	// to implement print() method from the Printable interface,
	// we can just use a lambda expression
	
}
