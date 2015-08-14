package collection.enum_map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import collection.enum_map.EnumMapImpl.NUMBER;

public class EnumMapMain {

	public static void main(String[] args) {

		 EnumMapImpl<NUMBER, Integer> enumMap = new EnumMapImpl<NUMBER, Integer>(NUMBER.class);
	        enumMap.put(NUMBER.FIRST, 100);
	        enumMap.put(NUMBER.SECOND, 200);
	        enumMap.put(NUMBER.THIRD, 300);
	 
	        System.out.println("the key set of the enumMap is ");
	        Set<NUMBER> keySet = enumMap.keySet();
	        Iterator<NUMBER> itr = keySet.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	        
	        System.out.println("the values of the enumMap is ");
	        Collection<Integer> collectionValues = enumMap.values();
	        Iterator<Integer> itr2 = collectionValues.iterator();
	        while (itr2.hasNext())
	        {
	            System.out.print(itr2.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	 
	        System.out.println("the entry set of the enumMap is ");
	        Iterator<Entry<NUMBER, Integer>> eitr;
	        Set<Entry<NUMBER, Integer>> entrySet = enumMap.entrySet();
	        eitr = entrySet.iterator();
	        while (eitr.hasNext())
	        {
	            System.out.println(eitr.next() + "\t");
	        }
	        System.out.println();
	        
	        System.out.println("the enumMap contains Key THIRD :" + enumMap.containsKey(NUMBER.THIRD));
	        System.out.println("the enumMap contains Value 600 :" + enumMap.containsValue(600));
	        System.out.println("the size of the enumMap is " + enumMap.size());
	        System.out.println();
	        
	        enumMap.clear();
	        if (enumMap.isEmpty())
	            System.out.println("the enumMap is empty");
	        else
	            System.out.println("the enumMap is not empty");
	}

}
