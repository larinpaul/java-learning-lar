package mapandhashmap;

import java.util.HashMap;


public class Main {

	public static void main(String[] args) {

		// A Map, on the basic level, is just a Set of key-value pairs
		
		HashMap<String, Integer> empIds = new HashMap<>();
		
		empIds.put("John", 12345);
		empIds.put("Carl", 54321);
		empIds.put("Jerry", 8675309);

		System.out.println(empIds);
		
		System.out.println(empIds.get("Carl")); // 54321
		System.out.println(empIds.get("zzzCarl")); // null
		
		System.out.println(empIds.containsKey("George")); // False
		
		System.out.println(empIds.containsValue(6)); // false
		System.out.println(empIds.containsValue(8675309));
		
		empIds.put("John", 98765); // Puts it there whether it's there or not
		System.out.println(empIds);
		
		empIds.replace("John", 33);
		empIds.replace("Kramer", 777); // Will do nothing
		System.out.println(empIds);
		
		empIds.putIfAbsent("John", 222); // Doesn't do much
		empIds.putIfAbsent("Steve", 222); // Adds Steve
		System.out.println(empIds);
		
		empIds.remove("Steve");
		System.out.println(empIds);
		
	}

}
