package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample4 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Jane");
		list.add("Heidi");
		list.add("Hannah");
		
//		// It is not allowed to modify an underlying collection while you're iterating!
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			System.out.println( iterator.next() );
//			// Exception in thread "main" java.util.ConcurrentModificationException
//			// ConcurrentModificationException doesn't mean anything to do with other threads,
//			// it just means an underlying collection was modified
//			list.remove( list.size() - 1 );
//			// but it we will remove the modification, it will run normally
//		}
		
		// Modify the list outside of the iterator
		list.remove( list.size() - 1 );

		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.println( iterator2.next() );
		}
		// This works fine :)
		
		
		Iterator<String> iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
			iterator3.remove();
		}
		System.out.println(list.size()); // 0
		
		
	}

}
