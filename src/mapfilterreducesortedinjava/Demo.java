package mapfilterreducesortedinjava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		
		int result2 = nums.stream()
				.filter(n -> n%2==0)
				.map(n -> n*2)
				.reduce(0, (c,e) -> c+(e*3));
		
		System.out.println(result2); // 72
		
//		Predicate<Integer> p = new Predicate<Integer>() {
//			
////			public boolean test(Integer n) {
////				if (n%2==0)
////					return true;
////				else
////					return false;
////			}
//
//			public boolean test(Integer n) {
//				return n%2==0;
//			}
//			
//		};

		Predicate<Integer> p = n -> n%2==0;
		
		int result = nums.stream()
				.filter(p)
				.map(n -> n*2)
				.reduce(0, (c,e) -> c+e);

		System.out.println(result); // 24

		// Now we now how .filter() works, and how how .map() works...
		
		
//		.map() needs and object of a Function<T, R>
		
//		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer nn) {
//				return nn*22;
//			}		
//		};
		
		Function<Integer, Integer> fun = nn -> nn*22;
		
		int result22 = nums.stream()
				.filter(nn -> nn%2==0)
				.map(fun)
				.reduce(0, (c,e) -> c+e);
		
		System.out.println(result22); // 264
		
		
		int result222 = nums.stream()
				.filter(nn -> nn%2==0)
				.map(n -> n*222)
				.reduce(0, (c,e) -> c+e);
		
		System.out.println(result222); // 2664
		
		
		// reduce() has two parameters:
		// T reduce(T identity, BinaryOperator<T> accumulator);
		// BinaryOperator extends BiFunction, which has the R apply(T t, U u); method
		
		
		Stream<Integer> sortedValues = nums.stream()
				.filter(n -> n%2==0)
				.sorted();
		
		sortedValues.forEach(n -> System.out.println(n));
		
		
		// Never use parallelStream for sorting!
		// but for filter, it works...
		Stream<Integer> sortedValuesParallel = nums.parallelStream()
				.filter(n -> n%2==0)
				.sorted();
		
		sortedValuesParallel.forEach(n -> System.out.println(n));
		

	}

}
