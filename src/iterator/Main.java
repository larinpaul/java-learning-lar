package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Jane");
		list.add("Heidi");
		list.add("Hannah");

		Iterator<String> iterator = list.iterator();
		
		Set<String> set = new HashSet();
		set.add("Jane");
		set.add("Heidi");
		set.add("Hannah");
		
		Iterator<String> iterator2 = set.iterator();
		
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		
		Iterator<String> keyIterator = map.keySet().iterator() ;
		Iterator<String> valueIterator = map.values().iterator();
		
		Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
				
	}

}
