package methodchaining;

public class Main {

	public static void main(String[] args) {
		
		// Method chaining = a common syntax for invoking multiple method calls in OOP
		// 						condense code into less lines
		
		String name = "       bro     ";
		
		name = name.concat("    code     ");
		name = name.toUpperCase();
		name = name.trim(); // Will remove any blank space before and after the String
		
		System.out.println(name);
		
		
		String name1 = "    bro      ";
		
		name1 = name1.concat("   code    ").toUpperCase().trim();
		
		System.out.println(name1);

	}

}
