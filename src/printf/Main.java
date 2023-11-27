package printf;

public class Main {

	public static void main(String[] args) {
		
		// printf() = an optional method to control, format, and display text to the console window
		// 		two arguments = format string + (object/variable/value)
		//		% [flags] [precision] [width] [conversion-character]
		
		System.out.printf("This is a format string %d", 123);
		System.out.printf("This is %d a format string", 123);

		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		float myFloat = 0.1f;
		
		// [conversion-character]
		System.out.printf("%b", myBoolean);
		System.out.println();
		System.out.printf("%c", myChar);
		System.out.println();
		System.out.printf("%s", myString); // Decimal, aka int
		System.out.println();
		System.out.printf("%d", myInt);
		System.out.println();
		System.out.printf("%f", myDouble); // Floating point aka double
		System.out.println();
		System.out.printf("f", myFloat);
		System.out.println();
	
		// [width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s", myString);
		System.out.println();
		
		// [precision]
		// sets number of didigts of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f", myDouble); // 1000.00
		System.out.println();
		System.out.printf("You have this much money %.1f", myDouble); // 1000.0
		System.out.println();
		
		// [flags]
		// adds an effect to output based on the flag added to foramt specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma group grouping separator if numbers > 1000
		System.out.printf("You have this much money %f", myDouble); // You have this much money 1000.000000
		System.out.println();
		System.out.printf("You have this much money %20f", myDouble); // You have this much money          1000.000000
		System.out.println();
		System.out.println();
		System.out.printf("You have this much money %+f", myDouble); // You have this much money +1000.000000
		System.out.println();
		System.out.printf("You have this much money %020f", myDouble); // You have this much money 0000000001000.000000
		System.out.println();
		System.out.printf("You have this much money %,f", myDouble); // You have this much money 1,000.000000
		System.out.println();
		System.out.printf("You have this much money %,.2f", myDouble); // You have this much money 1,000.00
		System.out.println();
		
	}

}
