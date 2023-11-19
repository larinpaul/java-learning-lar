//package reflection;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//
//public class Main {
//
//	public static void main(String[] args) throws Exception, IllegalAccessException, InvocationTargetException {
//
//		Cat myCat = new Cat(6, "Stella");
//		myCat.setAge(10);
//		Field[] catFields = myCat.getClass().getDeclaredFields();
//				
//		for (Field field : catFields) {
//			System.out.println(field.getName());
//		}
//		
//
//		// Typically, changing the name field is impossible
//		// because we don't have the setName method
//		// But we have this:
//		for (Field field : catFields) {
//			if (field.getName().equals("name")) {
//				field.setAccessible(true);
//				field.set(myCat, "Jimmy McGill");
//			}
//		}
//		
//		Method[] catMethods = myCat.getClass().getDeclaredMethods();
//		
////		for (Method method : catMethods) {
////			if (method.getName().equals("meow")) {
////				method.invoke(myCat /* here you can also add arguments in their call order */);
////				myCat.meow();
////				myCat.heyThisIsPrivate();
////			}
////			System.out.println(method.getName());
////		}
//		
//		for (Method method : catMethods) {
//			if (method.getName().equals("heyThisIsPrivate")) {
//				method.setAccessible(true);
//				method.invoke(myCat);
//			}
//		}
//		
//		for (Method method : catMethods) {
//			if (method.getName().equals("thisIsAPublicStaticMethod")) { // beware if the name of the method changes
//				method.setAccessible(true);
//				method.invoke(null);
//			}
//		}
//		
//		System.out.println(myCat.getName()); // Supposed to be a new name
//	}
//
//}
