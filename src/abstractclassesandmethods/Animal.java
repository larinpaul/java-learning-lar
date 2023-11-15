package abstractclassesandmethods;

public abstract class Animal {
	
	int age;
	String name;
	
	public abstract void makeNoise();
	
	public void printName() {
		System.out.println("My name is " + name);
	}

}
