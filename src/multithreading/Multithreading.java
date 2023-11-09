package multithreading;

public class Multithreading {

	public static void main(String[] args) {

		//// Using Runnable:
		for (int i = 0; i <= 3; i++) {
			MultithreadThingRunnable myThing = new MultithreadThingRunnable(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
			
//			try {
//				myThread.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // Stops executing this thread until this thread completes

			System.out.println(myThread.isAlive()); // Returns a boolean
			
		}
		
		// Runnable is preferred, because it's an interface,
		// so you can use "multiple inheritance", or "multiple composition"
		
		
		
		
		//// Using Thread:
		
		MultithreadThing myThing = new MultithreadThing(1);
		MultithreadThing myThing2 = new MultithreadThing(2);
		
		for (int i = 0; i < 5; i++) {
			MultithreadThing myThing3 = new MultithreadThing(i);
			myThing3.start();
		}
				
//		myThing.run(); // This won't start a new thread... This will run as usual
		// If I were to use run(), the threads would run in parallel
		
		myThing.start();
		myThing2.start();
		
		System.out.println("Throwing a runtime exception");
		throw new RuntimeException();
		
	}

}
