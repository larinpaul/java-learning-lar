package assertkeyword;

public class Main {

	// assert keyword
	
	// * Assert is used during program development to create
	// an assertion, which is a condition that should be true
	// during the execution of the program.
	// * At run time, if the condition is true, no other action
	// takes place. However, if the condition is false, then an
	// AssertionError is thrown.
	
	static int val = 3;
	static int getnum() {
		return val--;
	}
	
	// BY DEFAULT THE ASSETIONS ARE DISABLED!
	// To enable assertions, you need to use the '-ea' command-line option
	// when running the Java Virtual Machine (JVM).
	// For example,. you can run your program with the following command:
	
	// public static void main(String args[])
	public static void main(String[] args) {
		
		// To see the `AssertionError` being thrown when `n` is 0,
		// you need to run your program with the `-ea`
		// command-line option to enable assertions.
		// * In Eclipse, you can go to the "Run" menu, select "Run Configurations",
		// and add the `-ea` option in the "VM arguments" field.
		
		int n ;
		for (int i = 0; i < 10; i++) {
			n = getnum();
			assert n > 0; // will fail when n is 0
			System.out.println("n is " + n);
		}
		
	}

}
