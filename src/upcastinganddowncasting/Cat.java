package upcastinganddowncasting;

class Cat extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("\"Meeeoow\"");
	}
	
	public void purr() {
		System.out.println("Purrr");
	}
	
}
