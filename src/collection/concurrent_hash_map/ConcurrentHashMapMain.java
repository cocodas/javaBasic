package collection.concurrent_hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConcurrentHashMapMain {

	public static void main(String[] args) {

		ConcurrentHashMapImpl<Integer, Integer> concurrentHashMap = new ConcurrentHashMapImpl<Integer, Integer>();
		concurrentHashMap.put(1, 100);
		concurrentHashMap.put(2, 200);
		concurrentHashMap.put(3, 300);
		concurrentHashMap.put(4, 400);

		Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>();
		concurrentHashMap.putAll(anotherMap);

		System.out.println("the key set of the concurrentHashMap is ");
		Set<Integer> keySet = concurrentHashMap.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println("the values of the concurrentHashMap is ");
		Collection<Integer> collectionValues = concurrentHashMap.values();
		itr = collectionValues.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println("the entry set of the concurrentHashMap is ");
		Iterator<Entry<Integer, Integer>> eitr;
		Set<Entry<Integer, Integer>> entrySet = concurrentHashMap.entrySet();
		eitr = entrySet.iterator();
		while (eitr.hasNext()) {
			System.out.println(eitr.next() + "\t");
		}
		System.out.println("the concurrentHashMap contains Key 3 :" + concurrentHashMap.containsKey(3));
		System.out.println("the concurrentHashMap contains Value 600 :" + concurrentHashMap.containsValue(600));
		System.out.println("Put the key 10 with value 1000  if not asscociated : " + concurrentHashMap.putIfAbsent(10, 1000));
		System.out.println("replace key 3 oldvalue of 300 and newvalue 500 :" + concurrentHashMap.replace(3, 300, 500));
		System.out.println("the size of the concurrentHashMap is " + concurrentHashMap.size());
		
		concurrentHashMap.clear();
		if (concurrentHashMap.isEmpty())
			System.out.println("the concurrentHashMap is empty");
		else
			System.out.println("the concurrentHashMap is not empty");
	}

}
