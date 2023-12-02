package iterator;

import java.util.List;
import java.util.ArrayList;

public class MyListIteratorExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		MyListIterator<String> iterator = new MyListIterator<>(list);
		while (iterator.hasNext()) {
			System.out.println( iterator.next() );
		}

	}

}
