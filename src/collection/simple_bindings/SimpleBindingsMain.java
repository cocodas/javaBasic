package collection.simple_bindings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SimpleBindingsMain {

	public static void main(String[] args) {

		 SimpleBindingsImpl simpleBindings = new SimpleBindingsImpl();
	        simpleBindings.put("one", 100);
	        simpleBindings.put("two", 200);
	        simpleBindings.put("three", 300);
	 
	        Map<String, Object> anotherMap = new HashMap<String, Object>(); 
	        anotherMap.put("four", 400);
	        anotherMap.put("five", 500);
	        simpleBindings.putAll(anotherMap);
	 
	        System.out.println("the key set of the simpleBindings is ");
	        Set<String> keySet = simpleBindings.keySet();
	        Iterator<String> itr = keySet.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	 
	        System.out.println("the values of the simpleBindings is ");
	        Collection<Object> collectionValues = simpleBindings.values(); 
	        Iterator<Object> citr = collectionValues.iterator();
	        while (citr.hasNext())
	        {
	            System.out.print(citr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	 
	        System.out.println("the entry set of the simpleBindings is ");
	        Iterator<Entry<String, Object>> eitr;
	        Set<Entry<String, Object>> entrySet = simpleBindings.entrySet();
	        eitr = entrySet.iterator();
	        while (eitr.hasNext())
	        {
	            System.out.println(eitr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the simpleBindings contains Key \"three\" :" +  simpleBindings.containsKey("three"));
	        System.out.println("the simpleBindings contains Value 600 :" + simpleBindings.containsValue(600));
	        System.out.println("the size of the simpleBindings is " + simpleBindings.size());
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        simpleBindings.clear();
	        if (simpleBindings.isEmpty())
	            System.out.println("the simpleBindings is empty");
	        else
	            System.out.println("the simpleBindings is not empty");
	}

}
