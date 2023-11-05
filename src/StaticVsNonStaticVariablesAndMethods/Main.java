package StaticVsNonStaticVariablesAndMethods;

public class Main {

	public static void main(String[] args) {

		System.out.println(Cat.getCatCount());
		
		// Non-static
		Cat myCat = new Cat();
		myCat.meow();
		myCat.name = "Stella";
		myCat.age = 8;
		
		// Static
		// Static methods and fields are not different per each individual Cat object
		System.out.println(Cat.getCatCount());		
		
		// This is discouraged because it might confuse a person
		// into thinking that getCatCount is a counter of only one cat
		System.out.println(myCat.getCatCount());
		
		System.out.println(Cat.MAX_LIVES);
		
	}

}
