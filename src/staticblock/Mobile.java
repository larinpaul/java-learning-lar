package staticblock;

public class Mobile {
	
	String brand;
	int price;
	static String name;
	
	// To initialize our static variable, we don't need a constructor,
	// because it will assign a value to the variable each time we instantiate our class
	// so we will use a static block! :)
	static {
		name = "Phone"; 
		System.out.println("This will be called only once because it's inside the static block");
	} // It will be called only once, irrespective of how many objects you'll create
	
	public Mobile() {
		brand = "";
		price = 200;
//		name = "Phone"; // We don't need to do that because name is static
		System.out.println("This will be every single time because it's inside the constructor");
	}
	
	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}
	

}

