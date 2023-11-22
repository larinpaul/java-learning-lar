package lambdaexpressionbro;

public class Main {

	public static void main(String[] args) {

		// Lambda expression = feature for Java 8 and above
		// 		also known as an anonymous method
		//		a shorter way to write anonymous classes with only one method
		//
		//		need to use a functional interface or use a pre-defined functional interface
		//		they contain only one abstract method
		//		ex. ActionListener, Runnable, (user-defined)
		//
		//		A Lambda expression can be used in any place where a functional interface would normally be required
		//		How to use a lambda expression:
		//		(arguments) -> {statement/s}
//		
//		// If there were no Lambdas, we would write something like this:
//		MyInterface myInterface = new MyInterface() {
//			public void message() {
//				System.out.println("Here's your message!");
//			}
//		};
//		myInterface.message(); // Here's your message!
		
		MyInterface myInterface = () -> {
			System.out.println("Here's your message from a Lambda! :)");
		};
		myInterface.message();
		
		MyInterface myInterface1 = () -> System.out.println("And another, shorter message!");
		myInterface1.message();
		myInterface1.message();
		
		MyInterface myInterface2 = () -> {
			System.out.println(" //   Heello World!   \\\\");
			System.out.println("//It is a nice day, no?\\\\");
		}; // <-- Don't forget the semicolon ; )
		myInterface2.message();
				
		String nameBro = "Bro";
				MyInterfaceWithParam myInterface3 = (name) -> {
			System.out.println(" //     Heello, " + name + "!    \\\\");
			System.out.println("// It is a nice day, no? \\\\");
		};
		myInterface3.message(nameBro);
		
		char myChar = '!';
		MyInterfaceWithTwoParams myInterface4 = (name, character) -> {
			System.out.println("Hello, " + name + ", nice to see you again" + character);
		};
		myInterface4.message(nameBro, myChar);
		
		
		//// 2023/11/22 // 18:00 //
		
		MyFrame myFrame = new MyFrame();
		
	}

}
