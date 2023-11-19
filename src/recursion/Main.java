package recursion;

public class Main {

	public static void main(String[] args) {
		
		// What recursion is?
		// All recursion is, is when you have a method that calls itself

//		sayHi();
		
		sayHi(3); // No stack overflow
		sayHi(1000); // No stack overflow
		sayHi(100000); // Stack overflow
		
	}
	
//	private static void sayHi() {
//		System.out.println("Hi!");
//		sayHi();
//		// This will blow up with a stack overflow error!
//		// This is because there were too many method calls on the call stack		
//	}
	
	private static void sayHi(int count) {
		System.out.println("Hi!");
		
		if (count <= 1) {
			return;
		}
		sayHi(count -1 );
	}

}
