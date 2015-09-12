package collection.weak_hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WeakHashMapMain {

	public static void main(String[] args) {

		WeakHashMapImpl<Integer, Integer> weakhashMap = new WeakHashMapImpl<Integer, Integer>();
        weakhashMap.put(1, 100);
        weakhashMap.put(2, 200);
        weakhashMap.put(3, 300);
 
        Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>();
        anotherMap.put(4, 400);
        anotherMap.put(5, 500);
 
        weakhashMap.putAll(anotherMap);
        
        System.out.println("the key set of the weakhashmap is ");
        Set<Integer> keySet = weakhashMap.keySet();
        Iterator<Integer> itr = keySet.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println();
        System.out.println("*******************************" + "\n");
        
        System.out.println("the values of the weakhashmap is ");
        Collection<Integer> collectionValues = weakhashMap.values();
        itr = collectionValues.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println();
        System.out.println("*******************************" + "\n");
        
        System.out.println("the entry set of the weakhashmap is ");
        Iterator<Entry<Integer, Integer>> eitr;
        Set<Entry<Integer, Integer>> entrySet = weakhashMap.entrySet();
        eitr = entrySet.iterator();
        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
        
        System.out.println("the weakhashmap contains Key 3 :" + weakhashMap.containsKey(3));
        System.out.println("the weakhashmap contains Value 600 :" + weakhashMap.containsValue(600));
        System.out.println("the size of the weakhashmap is " + weakhashMap.size());
        
        System.out.println();
        System.out.println("*******************************" + "\n");
        
        weakhashMap.clear();
        if (weakhashMap.isEmpty())
            System.out.println("the weakhashmap is empty");
        else
            System.out.println("the weakhashmap is not empty");
	}

}
