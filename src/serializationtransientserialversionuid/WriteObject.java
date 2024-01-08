package serializationtransientserialversionuid;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		Person person1 = new Person(1, "Mike");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
			oos.writeObject(person1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//public class WriteObject {
//	public static void main(String[] args) {
//		Person person1 = new Person(1, "Mike");
//		
//		try {
//			FileOutputStream fos = new FileOutputStream("people.bin");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			oos.writeObject(person1);
//			fos.close();
//			System.out.println("The object has been saved");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//}