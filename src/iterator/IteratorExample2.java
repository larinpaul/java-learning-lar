package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorExample2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Jane");
		list.add("Heidi");
		list.add("Hannah");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println( next );
		}
		
		Set<String> set = new HashSet<>();
		set.add("Jane");
		set.add("Heidi");
		set.add("Hannah");
		
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println( iterator2.next() );
		}

	}

}
