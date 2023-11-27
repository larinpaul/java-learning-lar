package records;

// It generated private fields for all the components that we listed here, and they are 
public record EmployeeRecord(String name, int employeeNumber) /*extends EmployeeClass <--- Inheritance is not allowed! */  {
	// records are also implicitly final classes, which means that they cannot be extended by any other class either
	// however, you can IMPLEMENT interfaces! But you will have to @Override all the necessary methods...
	
	// It also generates getters
	
	// It will also generate a certain type of constructor
	
	// A record doesn't generated a no args constructor,
	// it generates a "canonical constructor".
	
	// Finally, it will also generate the implementations
	// for toString(), hashCode() and equals()
	
	// You can also create instance methods
	public String nameInUpperCase() {
		return name.toUpperCase();
	}
	
	public static void printWhatever() {
		System.out.println("Whatever");
	}
	
	// You can also have static fields
	public static final String DEFAULT_EMPLYOEE_NAME = "George";
	
	// However you cannot define your own non-static instance fields
//	private String something; // Error! Instance field is not allowed in a record
	
	// You can also override the canonical constructor...
//	public EmployeeRecord (String name, int employeeNumber) {
//		if (employeeNumber < 0) {
//			throw new IllegalArgumentException("employeeNumber cannot be negative");
//		}
//		this.name = name;
//		this.employeeNumber = employeeNumber;
//	}
	
	// You can also use what is called a "compact constructor"
	// The same as above, but with no need for parameters...
	public EmployeeRecord {
		if (employeeNumber < 0) {
			throw new IllegalArgumentException("employeeNumber cannot be negative");
		}
	}
	
}
