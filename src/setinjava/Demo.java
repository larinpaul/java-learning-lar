package setinjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		nums.add(6);
//		nums.add("5");
		
		System.out.println(nums.indexOf(5)); // 1
		System.out.println(nums.get(2)); // 8 
		
//		System.out.println("Print out all the values");
//		for (Object n : nums) {
//			int num = (Integer) n;
//			System.out.println(num * 2);
//		}
		
		Set<Integer> nums2 = new HashSet<Integer>();
		nums2.add(6);
		nums2.add(5);
		nums2.add(8);
		nums2.add(2);
		nums2.add(62);
		nums2.add(54);
		nums2.add(82);
		nums2.add(21);
//		nums2.add(6); // The second 6 will not be printed out, because it is a set :)
//		nums2.add("5");

//		// There is no get method:
//		nums2.get(0); // Impossible, because a set does not have any indexes!
		
		// It is NOT printed out as sorted!
		// Set will not give you a value in a sorted order
		System.out.println("Print out all the values");
		for (int n : nums2) {
			System.out.println(n);
		}
		
		// And what if you want the sorted values?
		// Well, for that we need a TreeSet! :)
		System.out.println("Print out all the values of a TreeSet! :)");
//		Set<Integer> nums3 = new TreeSet<Integer>();
		// Instead of saying Set, we can also day Collection, that will work as well
		Collection<Integer> nums3 = new TreeSet<Integer>();
		nums3.add(62);
		nums3.add(54);
		nums3.add(82);
		nums3.add(21);
//		nums.add("5");
		for (int n : nums3) {
			System.out.println(n);
		}

		
	}

}
