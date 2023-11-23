package staticblock;

public class Main {

	public static void main(String[] args) {

		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "SmartPhone";
		
		obj1.show();
		
		Mobile obj2 = new Mobile();
		obj2.show();
		
		
		// And even if the class is not instantiated at all, we can do this:
		try {
			Class.forName("Mobile");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // HMM, It did run with an error though...
		} // This will not create any objects, but it will instantiate the class and will run the static block
		

	}

}
