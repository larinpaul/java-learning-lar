package upcastinganddowncasting;

public class Casting {

	public static void main(String[] args) {
		
		// Upcasting is when you take an object and cast it to its super class type, its parent type

		// Downcasting is when you take and object and cast it to one of its subtypes, it's child class
		
		
		//// Upcasting:
		Animal myAnimal = new Dog(); // We can directly upcast an object since Dog is a subclass of animal
		// Java basically allows to treat an object of a child type as an object of a parent type
		// but since it's treated as an animal, you can't treat it as a Dog:
		myAnimal.makeNoise(); // you can, and it will be: Woof woof!
//		myAnimal.growl(); // you can't

		doAnimalStuff(myAnimal); // Woof woof! 
		Animal myAnimal0 = new Animal();
		doAnimalStuff(myAnimal0); // I'm just an Animal
		Dog myAnimal1 = new Dog();
		doAnimalStuff(myAnimal1); // Woof woof!
		myAnimal1.makeNoise(); // Woof woof!
		myAnimal1.growl(); // Grrrrrr
		Cat myAnimal2 = new Cat();
		myAnimal2.makeNoise(); // "Meeeoow"
		doAnimalStuff(myAnimal2); // "Meeeoow" Purrr
		
		
		//// Downcasting:
		Animal myDog = new Dog();
		Dog myDogYeah = (Dog)myDog;
//		myDog.growl(); // won't work
		myDogYeah.growl(); // Grrrrrr
		
		Cat myCat = new Cat();
		doAnimalStuff(myCat);
		
	}
	
	// You can send an animal object, but you can also
	// send any subtype of animal!
	public static void doAnimalStuff(Animal animal) {
		animal.makeNoise();

		// Exception in thread "main" if we try to pass an Animal or a Cat in the main method...
//		Dog myDog = (Dog)animal;
//		myDog.growl();
		// So let's fix it:
		if (animal instanceof Dog) {
			Dog myDog = (Dog)animal;
			myDog.growl();
		}
		
	}
	
	// Without upcasting, you would've had to do this...
	public static void doAnimalStuff(Cat cat) {
		cat.makeNoise();
		cat.purr();
	}
//	public static void doAnimalStuff(Dog dog) {
//		dog.makeNoise();
//		dog.growl();
//	}

}
