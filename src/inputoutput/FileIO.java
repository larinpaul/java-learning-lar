package inputoutput;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class FileIO {

	public static void main(String[] args) {

		String[] names = {"John", "Carl", "Jerry"};
		try {
			// BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\john\\example\\output.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writing to a file.\n");
			writer.write("Writing to a file.");
			writer.write("\nWriting to a file.");
			writer.write("Writing to a file.\n");
			for(String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
			System.out.println("Successfully created or updated a file");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			System.out.println(reader.readLine()); // It prints out the first line
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			System.out.println("Finished reading the file.");
//		} catch (FileNotFoundException e) { // For some reason this one doesn't work
	    } catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
