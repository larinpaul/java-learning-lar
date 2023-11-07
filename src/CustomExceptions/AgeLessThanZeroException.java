package CustomExceptions;

//public class AgeLessThanZeroException extends Exception {
public class AgeLessThanZeroException extends IllegalArgumentException {

	// This is a basic no args constructor
	public AgeLessThanZeroException() {
		
	}
	
	public AgeLessThanZeroException(String message) {
		super(message);
	}
	
	// This constructor can be useful if the constructor is caused by another exception
	public AgeLessThanZeroException(Throwable cause) {
		super(cause);
	}
	
	public AgeLessThanZeroException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
