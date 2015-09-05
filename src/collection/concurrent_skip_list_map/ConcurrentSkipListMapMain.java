package collection.concurrent_skip_list_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConcurrentSkipListMapMain {

	public static void main(String[] args) {

		ConcurrentSkipListMapImpl<Integer, Integer> concurrentSkipListMap = new ConcurrentSkipListMapImpl<Integer, Integer>();
		concurrentSkipListMap.put(10, 100);
		concurrentSkipListMap.put(89, -89);
		concurrentSkipListMap.put(45, 345);
		concurrentSkipListMap.put(90, 23);
		
		Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>();
		anotherMap.put(34, 9);
		anotherMap.put(23, 00);
		concurrentSkipListMap.putAll(anotherMap);

		System.out.println("the key set of the concurrentSkipListMap map is ");
		Set<Integer> keySet = concurrentSkipListMap.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("the values of the concurrentSkipListMap is ");
		Collection<Integer> collectionValues = concurrentSkipListMap.values();
		itr = collectionValues.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("poll first entry of the map ");
		Map.Entry<Integer, Integer> pollFirstEntry = concurrentSkipListMap.pollFirstEntry();
		System.out.println("key = " + pollFirstEntry.getKey() + " value = " + pollFirstEntry.getValue());
		System.out.println();
		
		System.out.println("poll last entry of the map ");
		Map.Entry<Integer, Integer> pollLastEntry = concurrentSkipListMap.pollLastEntry();
		System.out.println("key = " + pollLastEntry.getKey() + " value = " + pollLastEntry.getValue());
		System.out.println();
		
		System.out.println("the entry set of the concurrentSkipListMap is ");
		Iterator<Entry<Integer, Integer>> eitr;
		Set<Entry<Integer, Integer>> entrySet = concurrentSkipListMap.entrySet();
		eitr = entrySet.iterator();
		while (eitr.hasNext()) {
			System.out.println(eitr.next() + "\t");
		}
		System.out.println();
		
		System.out.println("the concurrentSkipListMap contains Key 34 :" + concurrentSkipListMap.containsKey(34));
		System.out.println("the  concurrentSkipListMap contains Value 600 :" + concurrentSkipListMap.containsValue(600));
		System.out.println("the size of the concurrentSkipListMap is " + concurrentSkipListMap.size());
		System.out.println();
		
		concurrentSkipListMap.clear();
		if (concurrentSkipListMap.isEmpty()) 
			System.out.println("ConcurrentSkipListMap이 비어 있습니다.");
		else 
			System.out.println("ConcurrentSkipListMap이 비어 있지 않습니다.");
			
		
		
	}

}
