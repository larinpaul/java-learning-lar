package reflection;

class Cat {

	private int age;
	private final String name;
	
	Cat(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void meow() {
		System.out.println("Meow!");
	}
	
	private void heyThisIsPrivate() {
		System.out.println("Hey how did you call that?");
	}
	
	public static void thisIsAPublicStaticMethod() {
		System.out.println("I'm public and static!");
	}
	
//	private static void thisIsAPrivateStaticMethod() {
//		System.out.println("Hey, I'm private and static!");
//	}
	// But imagine we just changed it...
	private static void thisIsAPrivateStaticMethod() {
		System.out.println("Hey, I'm private and static!");
	}

	
}
