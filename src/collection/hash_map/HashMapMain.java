package collection.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {

		HashMapImpl<Integer, Integer> hashMap = new HashMapImpl<Integer, Integer>();
		 
        hashMap.put(1, 100);
        hashMap.put(2, 200);
        hashMap.put(3, 300);
        
 
        Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>();
        anotherMap.put(4, 400);
        anotherMap.put(5, 500);
 
        hashMap.putAll(anotherMap);
        
 
        System.out.println("the key set of the map is ");
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> itr = keySet.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("the values of the map is ");
        Collection<Integer> collectionValues = hashMap.values();
        itr = collectionValues.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("the entry set of the map is ");
        Iterator<Entry<Integer, Integer>> eitr;
        Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
        eitr = entrySet.iterator();
        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }
        System.out.println("*******************************" + "\n");
        
        System.out.println("the hash Map contains Key 3 :" + hashMap.containsKey(3));
        System.out.println("the hash Map contains Value 600 :" + hashMap.containsValue(600));
        System.out.println("the size of the hash Map is " + hashMap.size());
        System.out.println("*******************************" + "\n");
        
        hashMap.clear();
        if (hashMap.isEmpty())
            System.out.println("the hash Map is empty");
        else
            System.out.println("the hash Map is not empty");
	}

}
