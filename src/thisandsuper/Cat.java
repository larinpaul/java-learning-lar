package thisandsuper;

public class Cat extends Animal {

	String catFoodPreference;
	
	// Standard example of a method overriding
//	@Override
//	public void makeNoise() {
//		System.out.println("Meow meow!!! :3 ");
//	}
//	
	
	// And what if inside Cat, I want to call the parent Animal implementation...
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Meow meow meow! :3 ");
	}
	
	// Oh, and you can even call it from another method,
	// not necessarily from an overridden method!
	public void jump() {
		// And it has to be first!
		super.makeNoise();
		System.out.println("Now I am jumping, hehe  :3 ");
		// Also, you cannot call super on a private method!
//		super.doSomethingPrivate();
	}
	
	// Even though it's unnecessary, we can even call super.eat()
	// But it's inherited anyway so it's not necessary
	
	
	//// The second way you could use the super keyword
	// is to use the parent class's constructors
	public Cat(int age, String name, String catFoodPreference) {
		super(age, name);
		// you can also do super(), but it's not necessary,
		// because Java will call the parent's class's 
		// no args constructor implicitly and automatically
		// but yeah, if you want to use some parameters,
		// like super(age, name); you have to explicitly show it
		this.catFoodPreference = catFoodPreference;
		
		// ALSO, A TRICKY ERROR:
		// If the default constructor Animal() is absent,
		// you DO have to call super(age, name)! 
	}
	
	
}
