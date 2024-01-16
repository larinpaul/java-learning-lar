package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// In Java, we have a concept called
// call by value
// But we also have
// CALL BY METHOD
// It looks like a higher-order function in JavaScript or C#
// It is when we pass a function to a function

interface Parser {
	String parse(String str);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() <= 3) 
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		
		return s;
	}
}

class MyPrinter {
	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}

}

public class FirstCode {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Navin","Manoj","Priya","Anto","Ann","Bo");

		System.out.println();
		names.forEach(str -> System.out.print(str));

		
		System.out.println();
		Consumer<String> con = new Consumer<String>() {
			public void accept(String s) {
				System.out.print(s);
			}
		};
		
		names.forEach(con);
		
		
		System.out.println();
		Consumer<String> conLambda = (s) -> System.out.print(s);
		
		names.forEach(conLambda);
		
		
		System.out.println("Get to the method reference");
		names.forEach(System.out::print); // The basics of the method reference
		
		
		System.out.println();
		
		String str = "Nas";
		MyPrinter mp = new MyPrinter();
		mp.print(str, new Parser() {
			public String parse(String s) {
				return StringParser.convert(str);
			}
		});
		
		String str1 = "Navin Reddy";
		MyPrinter mp1 = new MyPrinter();
		mp.print(str1, new Parser() {
			public String parse(String s) {
				return StringParser.convert(str1);
			}
		});
		
		String str2 = "Lambda Expression";
		MyPrinter mp2 = new MyPrinter(); // Actually you can just use mp and not mp2 I guess
		mp2.print(str2, (s -> StringParser.convert(s)));
		
		String str3 = "Method Reference Static";
		MyPrinter mp3 = new MyPrinter(); // Actually you can just use mp and not mp3 I guess
		mp3.print(str3,(StringParser::convert));
		
// Ehhh, didn't work... // Supposed to work, though?
//		StringParser sp4 = new StringParser();
//		String str4 = "Method Reference Object";
//		MyPrinter mp4 = new MyPrinter();
//		mp4.print(str4, (sp4::convert));
		
		
	}

}
