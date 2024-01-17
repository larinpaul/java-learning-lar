package foreachmethod;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		
		// For a Consumer, you have to specify a type as well.
		Consumer<Integer> con = new Consumer<Integer>() {
			public void accept(Integer n) {
				System.out.println(n);
			}
		};
		
		// Consumer is a functional interface, which means we can use a Lambda Expression here! :)
		Consumer<Integer> con1 = (Integer n) -> {
			System.out.println(n);
		};
		
		Consumer<Integer> con2 = (n) -> System.out.println(n);
 		
		Consumer<Integer> con3 = n -> System.out.println(n);
		
		// forEach() takes an object of a Consumer
		nums.forEach(con);
		nums.forEach(con1);
		nums.forEach(con2);
		nums.forEach(con3);
		
//		nums.forEach(n -> System.out.println(n));
		
		

	}

}
