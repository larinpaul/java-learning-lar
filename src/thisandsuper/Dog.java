package thisandsuper;

public class Dog {

	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Another way to use this is inside constructors
	// to call other constructor methods
	public Dog() { // This is a no-args constructor, that can initiate a default Dog("Fido", 2)
		this("Fido", 1); // It even knows the variables because it can see the types...
		// and this call HAS to be the first statement in the constructor!
		System.out.println("Fido the dog has begun its journey!");
	}
	
	
	// You can't use this in a static context:
	public static void printStuff() {
//		this.name; 
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	
}
