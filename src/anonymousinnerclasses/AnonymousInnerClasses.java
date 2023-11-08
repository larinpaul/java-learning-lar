package anonymousinnerclasses;

public class AnonymousInnerClasses {

	public static void main(String[] args) {

		Animal myAnimal = new Animal();
		myAnimal.makeNoise();
		
		// We are creating an anonymous subclass of the Animal class..
		// We create an unnamed child class for just one object
		Animal bigfoot = new Animal() {
			@Override
			public void makeNoise() {
				System.out.println("Grawlneenlnenlengehehe");
			}
		};
		bigfoot.makeNoise();
		
		Runnable myAnonymousRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("I'm an anonymous runnable!");
			}	
		};
		myAnonymousRunnable.run();
		
	}

}
