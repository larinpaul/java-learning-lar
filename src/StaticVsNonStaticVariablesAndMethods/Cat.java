package StaticVsNonStaticVariablesAndMethods;

public class Cat {

	public static final int MAX_LIVES = 9;
	String name;
	int age;
	int livesRemaining;
	private static int catCount = 0;
	
	public static int getCatCount() {
		return catCount;
	}

	public void meow() {
		System.out.println("Meow");
	}
	
	public Cat() {
		catCount++;
		livesRemaining = MAX_LIVES;
	}
	
}
