package finalkeyword;

public class Dog extends Animal { // Animal is final so Dog cannot extend it!
	
	private int walkDitancePreference;
	
	public void bark() {
		System.out.println("Woof!");
		System.out.println("Pi equals " + Main.PI + ", woof woof!");
//		System.out.println("The true value of PI is " + Main.SECRET_CONSPIRACY_PI + ", wooooo!"); // Impossible!
	}
	
//	@Override
//	public void eat() { // Cannot override the final method from Animal
//		System.out.println("nom nom nom");
//	}
	
	public int getWalkDistancePreference() {
		return walkDitancePreference;
	}
	
	public void setWalkDistancePreference(int walkDistancePreference) {
		this.walkDitancePreference = walkDistancePreference;
	}

}
