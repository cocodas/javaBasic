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
        System.out.println("Attributes의 key set : ");
        Set<Object> keySet = attribute.keySet();
        Iterator<Object> itr = keySet.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
 
        System.out.println("Attributes의 값 : ");
        
        Collection<Object> collectionValues = attribute.values();
        itr = collectionValues.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
        
        System.out.println("Attributes의 entry set : ");
        Iterator<Entry<Object, Object>> entryItr;
        Set<Entry<Object, Object>> entrySet = attribute.entrySet();
        entryItr = entrySet.iterator();
        while (entryItr.hasNext())
        {
            System.out.println(entryItr.next() + "\t");
        }
        System.out.println();
        
        System.out.print("Attributes에 CLASS_PATH라는 키를 가지고 있나? : " );
        if (attribute.containsKey(CLASS_PATH)) {
			System.out.println("CLASS_PATH 키를 Attributes에 가지고 있습니다.");
		}else {
			System.out.println("CLASS_PATH 키를 Attributes에 가지고 있지 않습니다.");
		}
        System.out.println();
        
        System.out.println("Attributes에 TESTMAIN.java라는 값을 가지고 있나? : " + attribute.containsValue("TESTMAIN.java"));
        System.out.println();
        
        System.out.println("Attributes의 크기 : " + attribute.size());
        System.out.println();
        
       System.out.println("clear() 메소드 사용."); 
       attribute.clear();
        if (attribute.isEmpty())
            System.out.println("Attributes는 비어 있습니다.");
        else
            System.out.println("Attributes는 비어 있지않습니다.");
    }

}
