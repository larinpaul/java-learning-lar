package iterator;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class ListIteratorExample {

	public static void main(String[] args) {

		// List iterators can be used to iterate
		// the elements of a list in both directions,
		// both forwards and backwards 
		
		List<String> list = new ArrayList<>();
		list.add("Jane");
		list.add("Heidi");
		list.add("Hannah");
		
		System.out.println("===");
		ListIterator<String> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
