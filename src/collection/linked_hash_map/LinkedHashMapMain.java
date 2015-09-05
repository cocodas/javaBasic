package collection.linked_hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMain {

	public static void main(String[] args) {
		
		LinkedHashMapImpl<Integer, Integer> linkedHashMap = new LinkedHashMapImpl<Integer, Integer>();
        linkedHashMap.put(1, 100);
        linkedHashMap.put(2, 200);
        linkedHashMap.put(3, 300);
        linkedHashMap.put(4, 400);
 
        Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>();
        linkedHashMap.putAll(anotherMap);
        
        System.out.println("the key set of the linked hashmap is ");
        Set<Integer> keySet = linkedHashMap.keySet();
        Iterator<Integer> itr = keySet.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
        
        System.out.println("the values of the linkedhash map is ");
        Collection<Integer> collectionValues = linkedHashMap.values();
        itr = collectionValues.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("the entry set of the linkedhash map is ");
        Iterator<Entry<Integer, Integer>> eitr;
        Set<Entry<Integer, Integer>> entrySet = linkedHashMap.entrySet();
        eitr = entrySet.iterator();
        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }
        System.out.println("*******************************" + "\n");
 
        System.out.println("the hash Map contains Key 3 :" + linkedHashMap.containsKey(3));
        System.out.println("the hash Map contains Value 600 :" + linkedHashMap.containsValue(600));
        System.out.println("the size of the hash Map is " + linkedHashMap.size());
        System.out.println("*******************************" + "\n");
        
        linkedHashMap.clear();
        if (linkedHashMap.isEmpty())
            System.out.println("the linked hash Map is empty");
        else
            System.out.println("the hash Map is not empty");

	}

}
