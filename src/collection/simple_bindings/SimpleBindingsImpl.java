package collection.simple_bindings;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.script.SimpleBindings;

public class SimpleBindingsImpl {
	
	private SimpleBindings simpleBindings;
	 
    /** Default constructor uses a HashMap. **/
    public SimpleBindingsImpl()
    {
        simpleBindings = new SimpleBindings();
    }
 
    /** Constructor uses an existing Map to store the values. **/
    public SimpleBindingsImpl(Map<String, Object> m)
    {
        simpleBindings = new SimpleBindings(m);
    }
 
    /** Removes all of the mappings from this map. **/
    public void clear()
    {
        simpleBindings.clear();
    }
 
    /** Returns true if this map contains a mapping for the specified key. **/
    public boolean containsKey(Object key)
    {
        return simpleBindings.containsKey(key);
    }
 
    /** Returns true if this map maps one or more keys to the specified value. **/
    public boolean containsValue(Object value)
    {
        return simpleBindings.containsValue(value);
    }
 
    /** Returns a Set view of the mappings contained in this map. **/
    public Set<Map.Entry<String, Object>> entrySet()
    {
        return simpleBindings.entrySet();
    }
 
    /** 
     * Returns the value to which the specified key is mapped, or null if this 
     * map contains no mapping for the key.
     **/
    public Object get(Object key)
    {
        return simpleBindings.get(key);
    }
 
    /** Returns true if this map contains no key-value mappings. **/
    public boolean isEmpty()
    {
        return simpleBindings.isEmpty();
    }
 
    /** Returns a Set view of the keys contained in this map. **/
    public Set<String> keySet()
    {
        return simpleBindings.keySet();
    }
 
    /** Associates the specified value with the specified key in this map. **/
    public Object put(String key, Object value)
    {
        return simpleBindings.put(key, value);
    }
 
    /** Copies all of the mappings from the specified map to this map. **/
    public void putAll(Map<? extends String, ? extends Object> m)
    {
        simpleBindings.putAll(m);
    }
 
    /** Removes the mapping for the specified key from this map if present. **/
    public Object remove(Object key)
    {
        return simpleBindings.remove(key);
    }
 
    /** Returns the number of key-value mappings in this map. **/
    public int size()
    {
        return simpleBindings.size();
    }
 
    /** Returns a Collection view of the values contained in this map. **/
    public Collection<Object> values()
    {
        return simpleBindings.values();
    }

}
