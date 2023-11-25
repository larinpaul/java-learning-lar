package functionsupplierconsumer;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {


	}
	
//	/**
//	 * Function - map x to y
//	 */
//	Function<String, Integer>

	/*
	 * - What do functions (with a capital F) do?
	 * -- Allow us to convert one thing to another...
	 */
	Employee generateEmployeeId(Person p, Function<Person, String> mapToId) {
		Employee e = new Employee();
		e.setEmail(e.getEmail());
		e.setEmployeeId(mapToId.apply(p));
		return e;		
	} // Well, it converts Person to String
	
	// Let's call this method:
	Person p = new Person();
	
	private void companyGenerateEmployee() {
		generateEmployeeId(p, pp -> pp.getEmail().toUpperCase());
	}
	
	private void company2GenerateEmployee() {
		generateEmployeeId(p, pp -> pp.getEmail() + pp.getName());
	}
	
	
	//// Supplier functional interface
	
	/** 
	 * Supplier - provide something
	 * - A supplier supplies some value
	 * - It gives us something
	 * - The benefit is that something that is costly to produce but only needed in some
	 * situations can be passed as a supplier and then only evaluated if needed
	 */
	void createAccount(Employee e, Supplier<String> errorMsg) {
		if (e.getEmail() == null) {
			System.out.println(errorMsg.get());
		}
		// Create the account
	}
	
	// Let's call this method
	void createAccount() {
		createAccount(new Employee(), () -> "Invalid employee at " + LocalDateTime.now());
		// Could be expensive
		// Or just something you want top do something later - like get the time
		// ...both benefits of deferred execution
	}
	
	// Unlike Function<T,R>
	// Supplier<T> takes only one parameter
	
	
	/**
	 * Consumer - do something with something (and return nothing)
	 */
	
	/**
	 * - A consumer takes a value and does something with it
	 * - It returns nothing
	 */
	void logEmployee(Employee e, Consumer<Employee> logger) {
		System.out.println("Printing Employee Log");
		logger.accept(e);
	}
	
	// Let's call this method
	void logInDetail() {
		logEmployee(new Employee(), e -> {
			System.out.println(e.getEmail());
			System.out.println(e.getEmployeeId());
		});
	}
	
	void logLight() {
		logEmployee(new Employee(), e -> System.out.println(e.getEmail()));
	}
	//Printing a value means a value is consumed but nothing is returned
	
	// Function<T,R> // Get something, return something (mapping)
	// Supplier<T> // Get nothing, return something
	// Consumer<T> // Get something, return nothing
	
}
