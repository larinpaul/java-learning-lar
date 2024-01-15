package setinjava;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionAPI {
	
//	Map
//	 <-
//	 <-
//	 <-
//	
//	Iterable <- Collection
//					<- List
//						<- LinkedList
//						<- ArrayList
//					<- Queue
//						<- Dequeue
//					<- Set
//						<- HashSet
//						<- LinkedHashSet
	
	public static void main(String[] args) {
	
		Collection<Integer> nums = new TreeSet<Integer>();
		nums.add(62);
		nums.add(54);
		nums.add(82);
		nums.add(21);
		//nums.add("5");
		
		Iterator<Integer> values = nums.iterator();
//		for (int n : nums) {
//			System.out.println(n);
//		}
		System.out.println(values.next()); // This will only give you one element
		
		while(values.hasNext())
			System.out.println(values.next());
		

	}

}
