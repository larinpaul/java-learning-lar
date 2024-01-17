package exceptionserrorsandtheirhierarchy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	private static ABC abc;
	
	public static void main(String[] args) {
		
		ErrorExample errorExample = new ErrorExample();
//		errorExample.foo(); // ArithmeticException

		int array[] = {1,2,3};
//		System.out.println(array[4]); // ArrayIndexOutOfBoundsException
//		array[5] = 3; // ArrayIndexOutOfBoundsException
		
		
//		try {
//			abc.show();
//		} catch (NullPointerException e) {
//			System.out.println("Uhhh");
//			System.err.println("Uhhh");
//			e.printStackTrace();
//		} // NullPointerException
//		
//		try {
//			abc.show();
//		} catch (Exception e) {
//			System.out.println("Uhhh");
//			System.err.println("Uhhh");
//			e.printStackTrace();
//		} // NullPointerException

//		// Но многие из RuntimeException проще обработать через if,
//		// обработать их через try/catch может быть нежелательным
//		
//		if (abc == null) {
//			System.out.println("Null pointer!!");
//		} else {
//			abc.show();
//		}
		
		
//		// Как поступить если у нас несколько ошибок?
//		try {
//			System.out.println(1/0);
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException ex) {
//			ex.printStackTrace();
//		}
		
//		// Начиная вроде бы с 7 версии джавы,
//		// можно объединять два блока catch 
//		try {
//			abc.show();
//			System.out.println(1/0);
//		} catch (NullPointerException | AritmeticException e) {
//			e.printStackTrace();
//		} For some reason it doesn't work though...

		
		FileInputStream fileInputStream = null; // yeah, gotta initializze by adding null
		FileInputStream fileInputStream1 = null;
		try {
			fileInputStream = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Nice one! :)");
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
