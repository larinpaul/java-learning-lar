package multiplethreadsthreadpriorityandsleap;

class A extends Thread {
	
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

		
		// 1 is the least priority
		// 10 is the highest priority
		// 5 is the normal priority
		System.out.println(obj1.getPriority()); // 5
		System.out.println(obj2.getPriority()); // 5
		
//		// The lowest
//		obj2.setPriority(1);
		// The lowest as well
		obj2.setPriority(Thread.MIN_PRIORITY);
		
		// In parallel
		obj1.start();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		
//		// One after another
//		obj1.run();
//		obj2.run();

	}

}
