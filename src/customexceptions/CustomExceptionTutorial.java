package customexceptions;

public class CustomExceptionTutorial {

	public static void main(String[] args) throws AgeLessThanZeroException {
		validateAge(3);
		validateAge(-1); // Exception in thread "main" CustomExceptions.AgeLessThanZeroException
		System.out.println("Hello! Have a nice day! :)");
	}
	
	private static void validateAge(int age) throws AgeLessThanZeroException {
		if (age < 0) {
//			throw new AgeLessThanZeroException();
//			throw new AgeLessThanZeroException("Oh no! Something went wrong!");
//			throw new Exception("Oh no! Something went wrong!");
//			throw new AgeLessThanZeroException(new RuntimeException()); // Caused by: java.lang.RuntimeException
			throw new AgeLessThanZeroException("Oh no!", new RuntimeException());
		}
	}

}
