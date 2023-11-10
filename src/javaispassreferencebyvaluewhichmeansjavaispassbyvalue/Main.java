package javaispassreferencebyvaluewhichmeansjavaispassbyvalue;

public class Main {

	public static void main(String[] args) {

		Cheese myCheese = new Cheese();
		myCheese.setLevelOfTaste(10);
		
		increaseTasteLevel(myCheese); // 11
		
		System.out.println(myCheese.getLevelOfTaste()); // 11
		
		setTasteToThreeHundred(myCheese);
		
		System.out.println(myCheese.getLevelOfTaste()); // still 11...

	}
	
	private static void increaseTasteLevel(Cheese cheese) {
		cheese.setLevelOfTaste(cheese.getLevelOfTaste() + 1);
	}
	
	private static void setTasteToThreeHundred(Cheese cheese) {
		cheese = new Cheese(); // here this is a new Cheese object
		cheese.setLevelOfTaste(300); // so this is the different cheese! :@
		// if we removed cheese = new Cheese();, it would work as in the first method
	}
	
	// myCheese variable doesn't hold the value,
	// it holds a reference to a certain spot in memory

	// since Java is pass by value, increaseTasteLevel copies the memory location
	// so both the objects point to the same memory location of myCheese and the Cheese object
	// and so the change in the method takes effect in the original variable
	
}
