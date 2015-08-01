package collection.attribute_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.jar.Attributes;

public class AttributeMain {

	public static void main(String[] args) {

		Attributes.Name CLASS_PATH = new Attributes.Name("CLASS_PATH");
        Attributes.Name CONTENT_TYPE = new Attributes.Name("CONTENT_TYPE");
        Attributes.Name MANIFEST_VERSION = new Attributes.Name("MANIFEST_VERSION");
 
        AttributesImpl attribute = new AttributesImpl();
        attribute.put(CLASS_PATH, "root/sub_dir/class_path");
        attribute.put(CONTENT_TYPE, "UTF-8");
        attribute.put(MANIFEST_VERSION, "2");
 
        attribute.putValue("MAIN_CLASS", "TESTMAIN.java");
        System.out.println("the key set of the Attributes is ");
        Set<Object> keySet = attribute.keySet();
        Iterator<Object> itr = keySet.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
 
        System.out.println("the values of the Attributes is ");
        Collection<Object> collectionValues = attribute.values();
        itr = collectionValues.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
        
        System.out.println("the entry set of the Attributes is ");
        Iterator<Entry<Object, Object>> eitr;
        Set<Entry<Object, Object>> entrySet = attribute.entrySet();
        eitr = entrySet.iterator();
        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }
        System.out.println();
        
        System.out.println("the Attributes contains Key CLASS_PATH:" + attribute.containsKey(CLASS_PATH));
        System.out.println();
        
        System.out.println("the Attributes contains Value TESTMAIN.java :" + attribute.containsValue("TESTMAIN.java"));
        System.out.println();
        
        System.out.println("the size of the Attributes is " + attribute.size());
        System.out.println();
        
       attribute.clear();
        if (attribute.isEmpty())
            System.out.println("the Attributes is empty");
        else
            System.out.println("the Attributes is not empty");
    }

}
