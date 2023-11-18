package garbargecollection;

public class Main {

	public static void main(String[] args) {
		doCatStuff();
		System.out.println("I'm done doing cat stuff.");
		
//		myCat // The variable is already out of scope		
	}
	
	private static void doCatStuff() {
		Cat myCat = new Cat();
		myCat.meow();
	}

}
