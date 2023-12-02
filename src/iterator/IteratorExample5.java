package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class IteratorExample5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Jane");
		list.add("Heidi");
		list.add("Hannah");
		
		Iterator<String> iterator = list.iterator();
		iterator.forEachRemaining((element) -> {
			System.out.println( element );
		});

	}

}
