package primitivedatatypes;

public class Main {

	public static void main(String[] args) {

		// -128 to 127
		byte myByte = 12;
		
		// -32,768 to 32,767 - Never use this really
		short myShort = 1234;
		
		
		
		// -2,147,483,648 to 2,147,483,647
		int myInt = 2837;
		
		// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long myLong = 12345678910L; // <--- FAZ O L
		
		
		// about 6 decimal digits of precision
		float myFloat = 6.3F; // <--- Don't forget using F, or else it will assume it's a double
																	// and it can't put a double value into a float...
		// about 15 decimal digits of precision
		double myDouble = 45.213434;
		
		
		
		// true or false
		boolean myBoolean = true; // boolean literal
		boolean moreThan1000 = (myInt > 1000); // more often, you hold a result of some comparison
		
		
		
		// one character
		char myChar = 'W'; // By the way you can't put "W" because it's double-quoted and therefore a String!
		// ^^^ Orange means primitive data type
		String myString = "Stringie";
		// ^^^ Blue means Object data type
		
		
	}

}
