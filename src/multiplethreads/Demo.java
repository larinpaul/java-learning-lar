package multiplethreads;

class A extends Thread {
	
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("hi");
		}
	}
	
}

class B extends Thread {
	
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("hello");
		}
	}
	
}

public class Demo {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Start " + i);
		}
		
		System.out.println("Start! :)");
		
		A obj1 = new A();
		B obj2 = new B();
		
		// In parallel
		obj1.start();
		obj2.start();
		
//		// One after another
//		obj1.run();
//		obj2.run();

	}

}
