package objectandtostring;

public class Main {

	public static void main(String[] args) {

		Human h1 = new Human("Bob", 40);
		System.out.println(h1); // objectandtostring.Human@7c75222b
		System.out.println(h1.toString()); // println always calls toString() so it's the same as above
		
	}
	
}

@SuppressWarnings("unused")
class Human {
	
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	
}
