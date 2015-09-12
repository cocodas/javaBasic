package collection.hash_table;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableMain {

	public static void main(String[] args) {

		 HashTableImpl<Integer, Integer> hashTable = new HashTableImpl<Integer, Integer>();
		 
	        hashTable.put(1, 100);
	        hashTable.put(2, 200);
	        hashTable.put(3, 300);
	        hashTable.put(4, 100);
	 
	        System.out.println("the key set of the hashTable is ");
	        Set<Integer> keySet = hashTable.keySet();
	        Iterator<Integer> itr = keySet.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	 
	        System.out.println("the values of the hashTable is ");
	        Collection<Integer> values = hashTable.values();
	        itr = values.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the entry set of the hash table is");
	        Set<Entry<Integer, Integer>> entrySet = hashTable.entrySet();
	        Iterator<Entry<Integer, Integer>> eitr = entrySet.iterator();
	        while (eitr.hasNext())
	        {
	            System.out.println(eitr.next() + "\t");
	        }
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the enumeration of the elements in hash Table");
	        Enumeration<Integer> enumeration = hashTable.elements();
	        while (enumeration.hasMoreElements())
	        {
	            System.out.print(enumeration.nextElement() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	 
	        System.out.println("the enumeration of the keys in hash Table");
	        enumeration = hashTable.keys();
	        while (enumeration.hasMoreElements())
	        {
	            System.out.print(enumeration.nextElement() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the value " + hashTable.remove(2) + "removed");
	        System.out.println("the hash table contains 200 " + hashTable.containsValue(200));
	        System.out.println("*******************************" + "\n");
	        
	        hashTable.clear();
	        if (hashTable.isEmpty())
	            System.out.println("the hash table is empty after clear");
	        else
	            System.out.println("the hash table is not empty after clear");
	}

}
