package innerclasses;

public class OuterClass {

	int number = 6;
	
	public void heyThere() {
		System.out.println("Hey there!");
	
		class LocalInnerClass {
			String localInnerClassVariable = "Here's Johny";
			
			public void printLocalInnerClassVariable() {
				System.out.println(localInnerClassVariable);
			}
		}
		
		LocalInnerClass lic = new LocalInnerClass();
		lic.printLocalInnerClassVariable();
	
	}
	
	// InnerClass is now a member of the OuterClass class! :)
	public class InnerClass {
		
		// It can also have member variables and methods! :)
		int innerNumebr = 8;
		
		public void whatsUp() {
			System.out.println("What's up from the Inner Class! :)");
		}
		
	}
	
	public static class StaticInnerClass {
		
		int innerNumber = 9;
		
		public void whatsUp() {
			System.out.println("Hello from the static Inner Class! :D");
		}
		
	}
	
}
