package javagenerics;

public class Printer <T> {		// You can also do a BOUND on interfaces <T extends Animal & Serializable>
// public class Printer <T extends Animal> { // this is called a BOUNDED GENERIC

	T thingToPrint;
	
	public Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
	
}
