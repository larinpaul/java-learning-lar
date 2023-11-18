package constructors;

public class Dog {
	
	String name;
	int age;
	
	// Java creates a Default constructor, it takes no agruments at all
	// It creates a default no-args constructor
	public Dog() {
		
	}
		
//	// Let's set something via a constructor
//	public Dog() { // Note that it has no return value, not even void!
//		this.name = "Kramer";
//	}
	
	public Dog(String name) {
		this.name = name;
	}
	
//	public Dog(String somethingElse) { // This is not allowed, because we already have a String constructor
//		this.name = name;
//	}
	
	public Dog(int age) {
		this.age = age;
	}
	
	// Instead of one constructor for age and one for name, we can create a constructor for both name and age
	public Dog(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
}
