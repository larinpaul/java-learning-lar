package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		// Annotation are a kind of "metadata"
		
		@SuppressWarnings("unused") 
		Cat myCat = new Cat("Stella"); // VeryImportant annotation doesn't seem to work... 
		
		Dog myDog = new Dog("Spot");
		
		
		if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("This thing is very important");
		} else {
			System.out.println("This thing is not very important");
		}
		
		for (Method method : myCat.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(RunImmediately.class)) {
				try {
					RunImmediately annotation = method.getAnnotation(RunImmediately.class);
					
					for (int i = 0; i < annotation.times(); i++) {
						method.invoke(myCat);
					}

				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		for (Field field : myCat.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(ImportantString.class)) {
				try {
					Object objectValue = field.get(myCat);
					
					if (objectValue instanceof String stringValue) {
						System.out.println(stringValue.toUpperCase());
					}
					
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
	
			}
		}

	}

}
