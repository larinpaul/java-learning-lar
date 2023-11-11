package pojoandjavabean;

import java.io.Serializable;

// Serializable means that this can be written into databases and files
public class BeanCat implements Serializable {
	// By the way, Java Bean is always serializable, Spring Bean doesn't need to.
	// Java Bean must have a default no-arg constructor, Spring Bean doesn't need to.

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	// To be a JavaBean:
	// 1. No-args constructor
	// 2. Properties must be private
	// 3. Public getters and setters
	// 4. Must be serializable
	
}
