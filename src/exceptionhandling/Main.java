package exceptionhandling;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("And now an even weirder part...");
		System.out.println(printANumber()); // 5
		
//		int myInt = Integer.parseInt("pants"); // Will throw an exception!
		
		try {
			// Code that may cause an exception
			int myInt = Integer.parseInt("pants");
		}
		catch (NumberFormatException nfe) {
			// Code that we want to execute if this type of exception throws
			System.out.println("Hey dude, you can't make an int out of that. Stop trying to make that happen :)");
		}
		
		
		try {
			// Code that may cause an exception
			int myInt = Integer.parseInt("1");
		}
		catch (NumberFormatException nfe) {
			// Code that we want to execute if this type of exception throws
			System.out.println("Hey dude, you can't make an int out of that. Stop trying to make that happen :)");
		}
		System.out.println("Get here after parsing 1");
		
		// The exception hierarchy stipulates
		// that the type of exception that we put in the catch block
		// will catch only exceptions of that type or any subclass of that exception
		
		// For example, you would often see just Exception e:
		try {		// When you catch all exceptions, you call Pokemon exceptions, CATCH 'EM ALLL :O
			int myInt = Integer.parseInt("Exception e"); 
		}
		catch (Exception e) { // But it's probably better to use a more detailed exception level
			System.out.println("Hey bro, here's Exception e for ya! :D");
		}
		
		// Class NumberFormatException:
//
//			java.lang.Object
//				java.lang.Throwable
//					java.lang.Exception
//						java.lang.RuntimeException
//							java.lang.IllegalArgumentException
//								java.lang.NumberFormatException
	
		
		// If it's not caught in the method, it gets thrown up the call stack
		try {
			getInt();
		}
		catch (Exception e) {
			System.out.println("This is an exception that wasn't caught inside the getInt() method");
		}
		System.out.println("You got here after calling the getInt() method! :)");
	
		
		// You can catch multiple types of exceptions with multiple catch blocks
		try {
			getInt();
		}
		catch (NumberFormatException e) {
			System.out.println("Hey dude, you can't make an int out this!");
		}
		catch (NullPointerException e) {
			System.out.println("Hey dude, nothing seems to be pointing here!");
		}
		System.out.println("End here");
		
		// Instead of all of that above, we can just use this:
		try {
			getInt();
		}
		catch (NumberFormatException | NullPointerException e) {
			System.out.println("Hey dude, you can't make an int out of this thingy! :3");
		}
		System.out.println("End here");
		
		
		// If you want, you can include the finally block:
		try {
			getInt();
		}
		catch (NumberFormatException | NullPointerException e) {
			System.out.println("Hey dude, this is you can't make and int out of it");
		}
		finally { // This one runs regardless of whether an exception was thrown or not
			System.out.println("This will be printed out in any case! :D");
		}
		System.out.println("End here");
		 
		
		// A code block after throwing an error won't be executed:
		try {
			int myInt = Integer.parseInt("pants");
			System.out.println("This will not show in the console");
		}
		catch (NumberFormatException e) {
			System.out.println("Hey dude, you can't make an int out of this!");
		}
		finally {
			System.out.println("This will always run, because it's in the finally block");
		}
		System.out.println("End here");
		
		// A code block after throwing an error won't be executed:
		try {
			int myInt = Integer.parseInt("1");
			System.out.println("This will actually show in the console because the exception wasn't thrown");
			return;
		}
		catch (NumberFormatException e) {
			System.out.println("Hey dude, you can't make an int out of this!");
		}
		finally {
			System.out.println("This will always run, because it's in the finally block, even if there was a RETURN statement! O_o");
		}
		System.out.println("End here");
		
		

		
		
	}

	
//	// A method in which an exception is caught	
//	private static void getInt() {
//		try {
//			int myInt = Integer.parseInt("1");
//		}
//		catch (Exception e) {
//			System.out.println("This is an exception inside the getInt() method");
//		}
//	}
	
//	// If it's not caught in the method, it gets thrown up the call stack
//	private static void getInt() {
//		int myInt = Integer.parseInt("pants");
//	}
//	
	
	// I tried making it return int instead of just void but it didn't fully work
	private static int getInt() {
		int myInt = Integer.parseInt("pants");
		return myInt;
	}
	
	
	// An even weirder example
	private static int printANumber() {
		try {
			return 3;
		}
		catch (Exception e) {
			return 4;
		}
		finally {
			return 5;
		}
	}
	
	

}
