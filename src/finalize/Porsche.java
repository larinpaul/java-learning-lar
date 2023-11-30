package finalize;

public class Porsche {
	
//	IOReader ioReader = new IOReader();
	
	public void drive() {
		System.out.println("You are driving a Porsche...");
	}
	
	@Override
	public void finalize() { // You don't have a guarantee that this method is ever called, because it's controlled by the JVM
//		ioReader.close();
	}
	
	// What's the alternative to finalize() when using resources?
	// Well, provide a close() method! :)
	public void close() {
		// clean up IO Resources;
	}

}
