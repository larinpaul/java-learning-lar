package functionalinterface;

@FunctionalInterface
interface A {
	void show(); // Only one method is allowed
//	void run(); 
}
//class B implements A { // We could implement the interface inside of a class...
//	public void show() {
//		System.out.println("in show");
//	}
//}

// Functional interface was in Java 7
// But in Java 8 they added an amazing feature
// called Lambda Expression
public class Demo {

	public static void main(String[] args) {

		// Or we can directly implement the interface here
		A obj = new A() {
			public void show() {
				System.out.println("in show");
			}
		}; // <- Don't forget the ; here! ;)
		obj.show();

	}

}
