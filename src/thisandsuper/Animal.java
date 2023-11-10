package thisandsuper;

public class Animal {
	
	int age;
	String name;
	
	public Animal() {
		
	}
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
		
	public void makeNoise() {
		System.out.println("Hello, I am an animal.");
	}
	
	public void eat() {
		System.out.println("Munch munch!");
	}

	private void doSomethingPrivate() {
		System.out.println("Hey, this is my private business!");
	}
	
}
