package serializationtransientserialversionuid;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
			Person person1 = (Person) ois.readObject();
			System.out.println(person1);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


//public class ReadObject {
//	public static void main(String[] args) {
//		try {
//			System.out.println("Reading the saved object");
//			
//			FileInputStream fis = new FileInputStream("people.bin");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			
//			Person person1 = (Person) ois.readObject();
//			System.out.println(person1);
//			
//			ois.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//}
