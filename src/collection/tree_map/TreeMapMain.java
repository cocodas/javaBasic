package collection.tree_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMapMain {

	public static void main(String[] args) {

		TreeMapImpl<Integer, Integer> treeMap = new TreeMapImpl<Integer, Integer>();
        treeMap.put(10, 100);
        treeMap.put(89, -89);
        treeMap.put(45, 345);
        treeMap.put(90, 23);
        
        Map<Integer, Integer> anotherMap = new HashMap<Integer, Integer>();
        anotherMap.put(34, 9);
        anotherMap.put(23, 00);
        treeMap.putAll(anotherMap);
 
        System.out.println("the key set of the treeMap map is ");
        Set<Integer> keySet = treeMap.keySet();
        Iterator<Integer> itr = keySet.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("the values of the treeMap is ");
        Collection<Integer> collectionValues = treeMap.values();
        itr = collectionValues.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("poll first entry of the map ");
        Map.Entry<Integer, Integer> pollFirstEntry = treeMap.pollFirstEntry();
        System.out.println("key = " + pollFirstEntry.getKey() + " value = " + pollFirstEntry.getValue());
 
        System.out.println("poll last entry of the map ");
        Map.Entry<Integer, Integer> pollLastEntry = treeMap.pollLastEntry();
        System.out.println("key = " + pollLastEntry.getKey() + " value = " + pollLastEntry.getValue());
        
        System.out.println();
        System.out.println("*******************************" + "\n");
 
        System.out.println("the entry set of the treeMap is ");
        Iterator<Entry<Integer, Integer>> eitr;
        Set<Entry<Integer, Integer>> entrySet = treeMap.entrySet();
        eitr = entrySet.iterator();
        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }
        System.out.println();
        System.out.println("*******************************" + "\n");
        
        System.out.println("the treeMap contains Key 34 :" + treeMap.containsKey(34));
        System.out.println("the  treeMap contains Value 600 :" + treeMap.containsValue(600));
        System.out.println("the size of the treeMap is " + treeMap.size());
        
        System.out.println();
        System.out.println("*******************************" + "\n");
        
        treeMap.clear();
        if (treeMap.isEmpty()) 
			System.out.println("treeMap이 비어 있습니다.!!");
        else
        	System.out.println("treeMap이 비어 있지 않습니다.!!");
	}

}
