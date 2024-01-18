package streamapiinjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		// When you have a lot of data
		// Or when you work with multiple threads,
		// it's always better to have immutable data
		
		List<Integer> nums = Arrays.asList(4,5,7,8,9);
		
		nums.forEach(n -> System.out.println(n));
		
		// Whatever we'll do with the values will not affect our list...
		
		nums.stream(); 
//		nums.parallelStream(); // You can work with multiple threads withtout even the need to create them, Java will create them for you!
		
		// When you call the stream, it will return to you the stream of values
		Stream<Integer> data = nums.stream();
		
		data.forEach(n -> System.out.println(n + 10));
		// Once you consume the stream, you can't reuse it.
		// As a proof, in the first case up there, it will print out
		// but then you cannot do it, it will throw an error:
//		data.forEach(n -> System.out.println(n)); // IllegalStateException
		
		// So I guess you need to create another stream:
		Stream<Integer> data2 = nums.stream();
		data2.forEach(n -> System.out.println(n + 20));
		
		
		// Let's map something...
		Stream<Integer> data3 = nums.stream();
		long count = data3.count(); // If I store it in long, it will store the value beside the stream
		System.out.println(count);
		
		
		Stream<Integer> data4 = nums.stream();
		Stream<Integer> sortedData = data4.sorted();
		sortedData.forEach(n -> System.out.println(n));

		
		for (int n : nums) {
			System.out.println(n*2);
		}
		
		
		// map itself gives you a new stream!
		Stream<Integer> data5 = nums.stream();
		Stream<Integer> mappedData = data5.map(n -> n*55);
		mappedData.forEach(n -> System.out.println(n));
		
		// The same as on the upper line, but more shortly!
		Stream<Integer> data6 = nums.stream().map(n -> n+60);
		data6.forEach(n -> System.out.println(n));
		
		// And ever shorter, everything on one line!
		// This will not work though, because we cannot return from .forEach()
//		Stream<Integer> data7 = nums.stream().map(n -> n+70).forEach(n -> System.out.println(n));
		// So we make it like this:
		nums.stream().map(n -> n+70).forEach(n -> System.out.println(n));
		
		
		
	}

}
