package abstractclassesandmethods;

public class Cat extends Animal implements AnimalStuff {

	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}

	public void poop() {
		System.out.println("This cat poops");		
	}
	
	
	
}
