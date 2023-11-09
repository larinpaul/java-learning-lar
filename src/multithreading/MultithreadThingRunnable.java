package multithreading;

public class MultithreadThingRunnable implements Runnable {

	private int threadNumber;
	
	public MultithreadThingRunnable(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	
	@Override
	public void run() {
		// You can ride anything that you want to be multithreaded here
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + " from thread (Runnable) " + threadNumber);
				
				if (threadNumber == 3) {
					throw new RuntimeException();
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
	}

}
