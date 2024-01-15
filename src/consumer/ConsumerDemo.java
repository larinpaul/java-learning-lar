package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer <String> {

	
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//	}
//	
//	public static void main(String[] args) {
//		Consumer<String> consumer = new ConsumerDemo();
//		consumer.accept("Ramesh"); // Ramesh
//	}
	
	
//	public static void main(String[] args) {
//		Consumer<String> consumer = new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		};
//		consumer.accept("Ramesh");
//	}
	
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = (t) -> System.out.println(t);
		consumer.accept("Ramesh");

	// example 2
		
		Consumer<String> consumer2 = ( input ) -> System.out.println(input + " World !");
		Consumer<String> consumer3 = ( input ) -> System.out.println(input + " Java");
		consumer2.andThen(consumer3).accept("hello");
		// hello World !
		// hello Java
		
	
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Consumer<Integer> consumer4 = (t) -> System.out.println(t);
		integers.forEach(consumer4);
	
		
		System.out.println("No let's simplify it even further:");
		
		List<Integer> integers2 = Arrays.asList(1,2,3,4,5,6,7,8);
		integers2.forEach((t) -> System.out.println(t));
		
	}

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		
	}
	

}
