package records;

import java.util.Objects;

public class EmployeeClass {

	// Here's what you had to do before
	
	private final String name;
	private final int employeeNumber;
	
	public EmployeeClass (String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "EmployeeClass [name=" + name + ", employeeNumber=" + employeeNumber + "]";
	}

	public String getName() {
		return name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeNumber, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return employeeNumber == other.employeeNumber && Objects.equals(name, other.name);
	}
	
	
	
}
