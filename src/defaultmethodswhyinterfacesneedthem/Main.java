package defaultmethodswhyinterfacesneedthem;

public class Main {

	public static void main(String[] args) {

		System.out.println("Let's have fun with some default methods! :)");
		
//		Shape.defaultMethod(); // default method cannot be static
//		Rectangle.defaultMethod(); // default method cannot be static
		
		Shape rect1 = new Rectangle();
		rect1.defaultMethodToOverride();

	}
	
}

interface Shape {
	
	void draw();
	
	default void defaultMethodToOverride() {
		System.out.println("Shape's default method to be overridden");
	}
	
	default void m1() {
		System.out.println("m1 default method");
	}
}

class Rectangle implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Rectangle draw method");
	}
	
	@Override
	public void defaultMethodToOverride() { // Yeah, you can potentially override the default method as well
		System.out.println("This default method has been overridden!");
	}
}

class Square implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Circle draw method");
	}
	
}