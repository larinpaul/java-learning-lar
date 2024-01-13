package needofstreamapi;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i)); // 457326
		}
		
		System.out.println();
		
		for (int n : nums) {
			System.out.print(n); // 457326
		}
		
		System.out.println();
		
		nums.forEach((n) -> System.out.print(n)); // 457326
		
		
		
//		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
//		System.out.println(nums);
//		
//		int sum = 0;
//		for (int n : nums) {
//			if (n % 2 == 0) {
//				n = n * 2;
//				sum = sum + n;
//			}
//		}
//		System.out.println(nums); // nothing changed 
//		System.out.println(sum);
		
		

	}

}
