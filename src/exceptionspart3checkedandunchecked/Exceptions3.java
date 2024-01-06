package exceptionspart3checkedandunchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
	
	// https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html
	// ^^^ Все Exceptions в нём Checked кроме одного, Runtime exception
	
	public static void main(String[] args) {
		// Checked Exception(Compile time exception)
		// Unchecked (Runtime exception)
		
//		File file = new File("test");
//		try {
//			Scanner scanner = new Scanner(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		// Examples of unchecked exceptions:
//		// null pointer exception
//		// division by zero exception ArtihmeticException
//		int a = 1 / 0; // такие экшепшены не нужно обрабатывать, их нужно исправлять...

//		// NullPointerException
//		String name = null;
//		name.length(); //

//		// ArrayIndexOutOfBoundsException
//		int[] arr = new int[2];
//		System.out.println(arr[2]);
		
		// Runtime exception также можно обработать, но в этом нет особого смысла, от ошибок надо избавляться
		try {
			int[] arr = new int[2];
			System.out.println(arr[2]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

}
