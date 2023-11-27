package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		
		// Any changes of the stream will not affect the nums
		Stream<Integer> s1 = nums.stream();
		
		nums.forEach(n -> System.out.println(n));
		
		s1.forEach(n -> System.out.println(n+1));
//		s1.forEach(n -> System.out.println(n));
// Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//		at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
//		at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762)
//		at javalearning/streamapi.Main.main(Main.java:18)
		
		
		int sum = 0;
		for (int n : nums) {
			if (n % 2 == 0) {
				n = n * 2;
				sum = sum + n;
			}
		}
		System.out.println(sum);
		
		Stream<Integer> s2 = nums.stream();
		System.out.println("Print out s2:");
//		s2.forEach(n -> System.out.println(n)); // Ahhh, I can't use it or it throws an error later! Gotta fidn a way to use it...
		
		Stream<Integer> s3 = s2.filter(n -> n % 2 == 0);
		System.out.println("Print out s3:");
//		s3.forEach(n -> System.out.println(n));
		Stream<Integer> s4 = s3.map(n -> n*2);
		System.out.println("Print out s4:");
//		s4.forEach(n -> System.out.println(n));
		
		// You can also use something that will not give you a stream but an output
		int result = s4.reduce(0, (c,e) -> c+e);
		System.out.println("The final result is: " + result);
		
		
		List<Integer> nums1 = Arrays.asList(1,2,3,4,5,6,7,8);
		int result1 = nums1.stream()
			.filter(n -> n%2==0)
			.map(n -> n*2)
			.reduce(0, (c,e) -> c+e);
		System.out.println("The final result is: " + result1);
		
	}

}
