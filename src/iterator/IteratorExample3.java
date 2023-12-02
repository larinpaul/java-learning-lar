package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Jane");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
		}
		
		List list2 = new ArrayList();
		list2.add("Jane");

		Iterator iterator2 = list2.iterator();
		while (iterator2.hasNext()) {
			String next = (String) iterator2.next();
		}
		
		
		
	}

}
