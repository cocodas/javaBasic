package collection.attribute;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;

public class AttributesImpl {
	
	private Attributes attributes;
	 
    /** Constructs a new, empty Attributes object with default size. **/
    public AttributesImpl()
    {
        attributes = new Attributes();
    }
 
    /**
     * Constructs a new Attributes object with the same attribute name-value
     * mappings as in the specified Attributes.
     **/
    public AttributesImpl(Attributes attr)
    {
        attributes = new Attributes(attr);
    }
 
    /**
     * Constructs a new, empty Attributes object with the specified initial
     * size.
     **/
    public AttributesImpl(int size)
    {
        attributes = new Attributes(size);
    }
 
    /** Removes all attributes from this Map. **/
    public void clear()
    {
        attributes.clear();
    }
 
    /** Returns a copy of the Attributes **/
    public Object clone()
    {
        return attributes.clone();
    }
 
    /** Returns true if this Map contains the specified attribute name (key). **/
    public boolean containsKey(Object key)
    {
        return attributes.containsKey(key);
    }
 
    /**
     * Returns true if this Map maps one or more attribute names (keys) to the
     * specified value.
     **/
    public boolean containsValue(Object value)
    {
        return attributes.containsValue(value);
    }
 
    /**
     * Returns a Collection view of the attribute name-value mappings contained
     * in this Map.
     **/
    public Set<Map.Entry<Object, Object>> entrySet()
    {
        return attributes.entrySet();
    }
 
    /**
     * Returns the value of the specified attribute name, or null if the
     * attribute name was not found.
     **/
    public Object get(Object key)
    {
        return attributes.get(key);
    }
 
    /**
     * Returns the value of the specified Attributes.Name, or null if the
     * attribute was not found.
     **/
    public String getValue(Attributes.Name name)
    {
        return attributes.getValue(name);
    }
 
    /**
     * Returns the value of the specified attribute name, specified as a string,
     * or null if the attribute was not found.
     **/
    public String getValue(String name)
    {
        return attributes.getValue(name);
    }
 
    /** Returns true if this Map contains no attributes. **/
    public boolean isEmpty()
    {
        return attributes.isEmpty();
    }
 
    /** Returns a Set view of the attribute names (keys) contained in this Map. **/
    public Set<Object> keySet()
    {
        return attributes.keySet();
    }
 
    /**
     * Associates the specified value with the specified attribute name (key) in
     * this Map.
     **/
    public Object put(Object key, Object value)
    {
        return attributes.put(key, value);
    }
 
    /**
     * Copies all of the attribute name-value mappings from the specified
     * Attributes to this Map.
     **/
    public void putAll(Map<?, ?> m)
    {
        attributes.putAll(m);
    }
 
    /**
     * Associates the specified value with the specified attribute name,
     * specified as a String.
     **/
    public String putValue(String name, String value)
    {
        return attributes.putValue(name, value);
    }
 
    /** Removes the attribute with the specified name (key) from this Map **/
    public Object remove(Object key)
    {
        return attributes.remove(key);
    }
 
    /** Returns the number of attributes in this Map. **/
    public int size()
    {
        return attributes.size();
    }
 
    /** Returns a Collection view of the attribute values contained in this Map. **/
    public Collection<Object> values()
    {
        return attributes.values();
    }

}
