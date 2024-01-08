package arraylistandlinkedlist;

class A {
	
	public A() {
		System.out.println("Object has been created!");
	}
	
	 public void show() {
		 System.out.println("in A show");
	 }
}

public class Demo {

	public static void main(String[] args) {
		
		int marks;
		marks = 99;
		
//		// This is called reference creation:
//		A obj;
//		obj = new A();
//		obj.show();
		
//		// This is called object creation (NOT THE ENTIRE LINE!)
//		new A();
		
		A obj = new A();
		obj.show();
		
		new A(); // this is called an anonymous object
		// It will call a constructor, but, as you can see,
		// no way to call .show() though a variable
		// But you can still CAN call .show(), look at this!
		new A().show();
		
	}
	
	// What happens inside the JVM?
	
	// Stack memory // Heap memory //
	
	// obj is not the object, it's a reference variable!
	// obj is on the stack, // the object is in the heap!
	
}
