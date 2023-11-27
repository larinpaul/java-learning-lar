package trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int i = 0;
		int j = 0;
		
		try {
			j = 18/i;
			System.out.println("Bye");
		} // by the way, you can avoid using catch if you use finally immediately, although why would you do it?
		catch(Exception e) {
			System.out.println("Something went wrong.");
			System.out.println("Bye :)");
		}
		finally {
			System.out.println("Finally... :)");
			// Well, we can do it to close the resources! :)
			
		}
		
//		int num = 0;
//		BufferedReader br = null; // Don't forget that you need to declare it here so that it would be accessible in both the try and the finally scopes :)
//		try {
//			br = new BufferedReader(new InputStreamReader(System.in));
//			num = Integer.parseInt(br.readLine());
//			System.out.println(num);
////			br.close(); Instead of writing this two times, you can use finally!
//		}
//		finally {
//			System.out.println("Bye! :)");
//			br.close();
//		}
		
		
		// In Java, there is also try with resources, where we don't even need the finally block...
		
		int num = 0;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			num = Integer.parseInt(br.readLine());
			System.out.println(num);
		}
		// Anything that has Autocloseable, will close automatically
		
		
	}

}
