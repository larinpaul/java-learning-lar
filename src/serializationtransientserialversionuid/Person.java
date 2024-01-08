package serializationtransientserialversionuid;

import java.io.Serializable;

public class Person implements Serializable {
	// transient поля не сериализуются
	private transient int id; // По умолчанию инициализуется как 0
	private String personName;
	private int age;
	private byte type;
	
	// Поле serialVersionUID.
	// В некоторых JVM будет предупреждение, что хорошо бы вам иметь это поле
//	private static final long serialVersionUID = -3722203743604454371L;
	private static final long serialVersionUID = 339953568979759774L;
	
	public Person(int id, String name) {
		this.id = id;
		this.personName = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return personName;
	}
	
	public String toString() {
		return id + " : " + personName;
	}
	
	
}
