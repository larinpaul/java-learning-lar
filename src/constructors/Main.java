package constructors;

public class Main {

	public static void main(String[] args) {

		Dog myDog = new Dog(); // new Dog() is calling a Dog() constructor method
		System.out.println(myDog.name); // null because the default constructor doesn't set any fields 
			// Or now it's Kramer if we use name = "Kramer"; in the Dog() constructor with no arguments
		
		Dog myDogToo = new Dog("Jerry");
		System.out.println(myDogToo.name); // Jerry
		
		Dog myDogThree = new Dog(3);
		System.out.println(myDogThree.age);
		
		Dog myDogGeorge33 = new Dog("George", 33);
		System.out.println(myDogGeorge33.name + " " + myDogGeorge33.age);
		
		// BUT BEWARE if we have provided at least one constructor,
		// the DEFAULT constructor won't be generated on its own,
		// we will have to write it ourselves
		
		// And what if we don't any constructor at all? Let's create the "Constants" class...
		System.out.println(Constants.MY_NAME);
		
		// We can still do this:
		Constants myConstants = new Constants();
		// But what if we don't want to give the ability to change the values?
		// We just created a private constructor, private Constants();
		
	}

}
