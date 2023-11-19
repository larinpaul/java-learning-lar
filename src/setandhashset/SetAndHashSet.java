package setandhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetAndHashSet {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		
		names.add("Walter");
		names.add("Jesse");
		names.add("Skyler");
		names.add("Mike");
		names.add("Saul");
		names.add("Walter"); // Walter exists in the set, but it only exists once, Sets, by design, doesn't allow duplicates
		
		names.remove("Walter");
		// Sets are not Lists, so you cannot remove an item by index...
		// Even if you do this:
		names.remove(0); // this won't remove "an item on index 0", this removes an item 0 but it doesn't exist anyway...
		
		System.out.println(names); // Sets don't maintain the order, unlike Lists!
		
		System.out.println(names.size()); // 4
		
		System.out.println(names.contains("Saul")); // true
		System.out.println(names.contains("Gus")); // false
		System.out.println(names.isEmpty()); // false
		
		names.clear(); // removes all the elements 
		System.out.println(names);

		names.add("Walter");
		names.add("Jesse");
		names.add("Skyler");
		names.add("Mike");
		names.add("Saul");
		
		for (String name : names) {
			System.out.println(name);
		}

		// You can use a Lambda to iterate over a Set
		System.out.println("And now let's use a Lambda");
		names.forEach(System.out::println);
		
		// You can use an Iterator as well to iterate over a Set
		System.out.println("And now let's use an Iterator");
		Iterator<String> namesIterator = names.iterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		
		
		// You can remove all the duplicate elements using a Set
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(2);
		numberList.add(1);
		System.out.println(numberList); // [1, 2, 3, 2, 1]
		
		Set<Integer> numberSet = new HashSet<>();
		numberSet.addAll(numberList); // Add all could be replaced with a parameterized Constructor call
		System.out.println(numberSet); // [1, 2, 3, 4]
		// Using a parameterized constructor! :)
		Set<Integer> numberSet2 = new HashSet<>(numberList);
		System.out.println(numberSet2); // [1, 2, 3, 4]
		
		// TreeSet orders in what is called a "natural ordering"
		Set<Integer> treeNumberSet = new TreeSet<>(numberList);
		System.out.println(treeNumberSet);
		
		// Although HashSet is faster than TreeSet... Well, to each their own! :)
		Set<String> namesInNaturalOrder = new TreeSet<>();
		namesInNaturalOrder.add(":)");
		namesInNaturalOrder.add("a");
		namesInNaturalOrder.add("cbaa");
		namesInNaturalOrder.add("ba");
		namesInNaturalOrder.add("da");
		namesInNaturalOrder.add(":)");
		System.out.println(namesInNaturalOrder);
		
		// LinkedHashSet is almost as fast as HashSet, although still not as fast :)
		// There is also LinkedHashSet<>(), which maintains the insertion ordering of the Set!
		Set<String> namesInInsertionOrdering = new LinkedHashSet<>();
		namesInInsertionOrdering.add(":)");
		namesInInsertionOrdering.add("a");
		namesInInsertionOrdering.add("bbbb");
		namesInInsertionOrdering.add("aaaaa");
		namesInInsertionOrdering.add(":)");
		System.out.println(namesInInsertionOrdering);
				
	}

}
