package serialization3arrayserialization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		Person[] people = {
				new Person(1, "Bob"),
				new Person(2, "Mike"),
				new Person(3, "Tom")
		};
		
		try { // Файл может быть и без разширения, но обычно когда мы записываем данные в бинарный файл, мы используем расширение .bin
			FileOutputStream fos = new FileOutputStream("people.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// We couuuuuld write them separately...
//			oos.writeInt(people.length);
//			
//			for (Person person : people) {
//				oos.writeObject(person);
//			}
			
			// Or we could write write the array, because it is also an object!
			
			oos.writeObject(people);
			System.out.println("Wrote the people object!");
			fos.close();
			System.out.println("FileOutputStream is closed!");
		} catch (IOException e) { // IOException включает в себя FileNotFoundException, так что мы могли бы поймать только его
			e.printStackTrace();
		}
	}
}
