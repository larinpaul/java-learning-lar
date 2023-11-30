package finalize;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		// finalize() is a hook method
		// A hook method means a method that has an empty implementation in the class Object,
		// and if you want to use it, you would provide an implementation in your own class
		// by overriding this method, and then it will be called by the JVM.
		
		// The most important takeaway from this episode:
		// This method is flawed! Don't use it, don't override it... Don't do anything with it usually... :)
		// The problem is, the garbage collector runs at different times,
		// so you don't really know when it will really run...
		// Also, it makes the destruction of an object way slower... :O

		// @Deprecated(since="9")
//		protected void finalize() // Called by the garbage collector on an ojbect when garbage collection determines that there are no more references to the object.
		
		Object obj1 = new Object();
//		obj1.finalize(); // The method finalize() from the type Object is not visible

		Porsche porsche = new Porsche();
		
		try {
			System.out.println("Heeey! :D");
		}
//		catch (IOException eoe) {
//			throw eoe;
//		}
		finally {
			porsche.close();
		}
		
		
		
	}

}
