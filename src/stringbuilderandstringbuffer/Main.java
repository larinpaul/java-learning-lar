package stringbuilderandstringbuffer;

public class Main {

	public static void main(String[] args) {

		String str = new String();
		StringBuilder stringBuilder = new StringBuilder(); 
		stringBuilder.toString();
		// StringBuilder works faster but isn't thread safe
		// StringBuffer is slower and synchronized and thread safe
		stringBuilder.capacity(); // 16 (int capacity)
		stringBuilder.ensureCapacity(20); // can be more than 20, e.g. 34
		int cap = stringBuilder.capacity();
		System.out.println(cap); // 34
		StringBuilder sb = stringBuilder.append("Hot");
		System.out.println(sb);
		// When we work with sb, we work with the same object,
		// unlike String, in which case a new one is created
		String myString = "Hello ";
		myString.concat("Hot");
		System.out.println(myString); // Hello
		String myNewString = myString.concat("Hot");
		System.out.println(myNewString); // Hello Hot
		
		// StringBuilder and StringBuffer is faster when you have to concatenate tons of strings...
		
		stringBuilder.setLength(314);
		System.out.println(stringBuilder.capacity()); // 314
		
		stringBuilder.insert(0, "A");
		System.out.println(stringBuilder);
		stringBuilder.insert(1, "B");
		System.out.println(stringBuilder);
		stringBuilder.deleteCharAt(0);
		stringBuilder.deleteCharAt(0);
		System.out.println(stringBuilder);
		
		stringBuilder.reverse();
		System.out.println(stringBuilder);  // empty (why?)
		System.out.println(stringBuilder.reverse()); // Hot (why?)
		
		StringBuilder mySB = new StringBuilder("Nice!"); // Why did it work here but not in the previous example? hm...
		System.out.println(mySB.reverse()); // !eciN
		
		
	}

}
