package streamapiinjava;

import java.util.Arrays;
import java.util.function.Predicate;
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
		// This is like a Builder patters, because with each stream you build new stuff!
		
		// We can also write it like this:
		nums.stream() 
			.map(n -> n+80) // Here we got 2 streams in total
			.forEach(n -> System.out.println(n));
		
		// Let's sort it!
		nums.stream() 
			.sorted() // And here we've got 3 streams!
			.map(n -> n+90) // .stream() .sorted() .map()
			.forEach(n -> System.out.println(n));
		// By the way, we are not using a lot of memory,
		// The thing is, when we create a new stream, the older one is basically gone
		
		// Let's to try to sort only odd numbers...
		List<Integer> nums2 = Arrays.asList(6,5,2,8,1,7);
		
		nums2.stream()
			.filter(n -> n%2==1) // filter only the odd numbers
			.sorted()
			.map(n -> n + 100)
			.forEach(n -> System.out.println(n)); // 101 105 107
		
		
		// .filter() takes an object of Predicate
		// Predicate returns true or false
		// and what if we don't want to use a Lambda expression
		// and just want to use an object of Predicate?
		
		Predicate<Integer> predi = new Predicate<Integer>() {
			@Override
			public boolean test(Integer n) {
				if (n%2==0)
					return true;
				else
					return false;
			}
		};
		// And we know that a filter uses an object of predicate
		nums2.stream()
			.filter(predi)
			.sorted()
			.map(n -> n+110)
			.forEach(n -> System.out.println(n));
		
		// Let's simplify it even more...
		Predicate<Integer> predi2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer n) {
				return n%2==0;
			}
		};
		nums2.stream()
			.filter(predi2)
			.sorted()
			.map(n -> n+120)
			.forEach(n -> System.out.println(n));
		
		// And simplify it even more...
		Predicate<Integer> predi3 = (n) -> n%2==1;
		nums.stream()
			.filter(predi3)
			.sorted()
			.map(n -> n+130)
			.forEach(n -> System.out.println(n));
		
		// By the way, yes, we can just you that code instead of predi
		nums.stream()
			.filter(n -> n%2==1)
			.sorted()
			.map(n -> n+140)
			.forEach(n -> System.out.println(n));
		
		
		// And what if I don't want to print the values, but I want to add the values and print the final result out?
		int result = nums.stream()
			.filter(n -> n%2==0)
			.sorted() // I guess it could create an issue for parallelStream()
			.map(n -> n+150)
			.reduce(0, (c,e) -> c+e); // 0 is the starting value, c is the carry, e is your new value
		// Reduce takes two values:
		// T reduce(T identity, BinaryOperator<T> accumulator);
		// BinaryOperator extends BiFunction
		// By the way, reduce returns the value
		// that is why we need this:
		// int result = nums.stream()
		System.out.println(result); // 312
		
		
		// You can also use parallelStream(), but be careful
		// sometimes your values are dependent on the earlier operation
		// in that case, don't use parallel stream
		
	}

}
