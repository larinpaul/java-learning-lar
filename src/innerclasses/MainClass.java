package innerclasses;

public class MainClass {

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		outer.heyThere();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.whatsUp();
		
		OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
		staticInner.whatsUp();
		
	}

}
