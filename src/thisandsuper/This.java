package thisandsuper;

public class This {

	public static void main(String[] args) {

		// The this keyword is used to refer to the current object.
		// meaning it refers to the object that
		// the method you're currently in was called on
		
		Dog myDog = new Dog("Dooo", 2);
		myDog.setName("Kramer");
		System.out.println(myDog.getName());

		Dog fidoTheDog = new Dog();
		System.out.println(fidoTheDog.getName());
		
	}

}
