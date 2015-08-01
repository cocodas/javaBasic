package collection.attribute_list;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;

public class AttributesImpl {
	
	private Attributes attributes;
	 
    //default 持失切 持失
    public AttributesImpl()
    {
        attributes = new Attributes();
    }
 
  
    public AttributesImpl(Attributes attr)
    {
        attributes = new Attributes(attr);
    }
 

    public AttributesImpl(int size)
    {
        attributes = new Attributes(size);
    }
 
    public void clear()
    {
        attributes.clear();
    }
 
    public Object clone()
    {
        return attributes.clone();
    }
 
    public boolean containsKey(Object key)
    {
        return attributes.containsKey(key);
    }
 
    public boolean containsValue(Object value)
    {
        return attributes.containsValue(value);
    }
 
    public Set<Map.Entry<Object, Object>> entrySet()
    {
        return attributes.entrySet();
    }
 
    public Object get(Object key)
    {
        return attributes.get(key);
    }
 
    public String getValue(Attributes.Name name)
    {
        return attributes.getValue(name);
    }
 
    public String getValue(String name)
    {
        return attributes.getValue(name);
    }
 
    public boolean isEmpty()
    {
        return attributes.isEmpty();
    }
 
    public Set<Object> keySet()
    {
        return attributes.keySet();
    }
 
    public Object put(Object key, Object value)
    {
        return attributes.put(key, value);
    }
 
    public void putAll(Map<?, ?> m)
    {
        attributes.putAll(m);
    }
 
    public String putValue(String name, String value)
    {
        return attributes.putValue(name, value);
    }
 
    public Object remove(Object key)
    {
        return attributes.remove(key);
    }
 
    public int size()
    {
        return attributes.size();
    }
 
    public Collection<Object> values()
    {
        return attributes.values();
    }

}
