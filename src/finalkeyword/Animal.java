package finalkeyword;

public /* final */ class Animal { // <--- final!
	
	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public final void eat() { // <--- final!
		System.out.println("Munch munch munch");
	}
	

}
