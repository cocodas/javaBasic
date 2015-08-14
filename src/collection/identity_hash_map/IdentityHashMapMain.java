package collection.identity_hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IdentityHashMapMain {

	public static void main(String[] args) {

		IdentityHashMapImpl<Integer, Integer> identityhashMap = new IdentityHashMapImpl<Integer, Integer>();
        identityhashMap.put(1, 100);
        identityhashMap.put(2, 200);
        identityhashMap.put(3, 300);
 
        Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>();
        anotherMap.put(4, 400);
        anotherMap.put(5, 500);
 
        identityhashMap.putAll(anotherMap);
        
        System.out.println("the key set of the identityhashmap is ");
        Set<Integer> keySet = identityhashMap.keySet();
        Iterator<Integer> itr = keySet.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("the values of the identityhashmap is ");
        Collection<Integer> collectionValues = identityhashMap.values();
        itr = collectionValues.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("the entry set of the identityhashmap is ");
        Iterator<Entry<Integer, Integer>> eitr;
        Set<Entry<Integer, Integer>> entrySet = identityhashMap.entrySet();
        eitr = entrySet.iterator();
        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }
        System.out.println("*******************************" + "\n");
        
        System.out.println("the identityhashmap contains Key 3 :" + identityhashMap.containsKey(3));
        System.out.println("the identityhashmap contains Value 600 :" + identityhashMap.containsValue(600));
        System.out.println("the size of the identityhashmap is " + identityhashMap.size());
        System.out.println("*******************************" + "\n");
        
        identityhashMap.clear();
        if (identityhashMap.isEmpty())
            System.out.println("the identityhashmap is empty");
        else
            System.out.println("the identityhashmap is not empty");
        
	}

}
