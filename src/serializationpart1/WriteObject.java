package serializationpart1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		Person person1 = new Person(1, "Bob");
		Person person2 = new Person(2, "Mike");
		
		try { // Файл может быть и без разширения, но обычно когда мы записываем данные в бинарный файл, мы используем расширение .bin
			FileOutputStream fos = new FileOutputStream("people.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(person1);
			oos.writeObject(person2);
			
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // IOException включает в себя FileNotFoundException, так что мы могли бы поймать только его
			e.printStackTrace();
		}
	}
}
