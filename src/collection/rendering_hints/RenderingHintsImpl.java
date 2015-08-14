package collection.rendering_hints;

import java.awt.RenderingHints;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class RenderingHintsImpl {

	private RenderingHints renderingHints;
	 
    /**
     * Constructs a new object with keys and values initialized from the
     * specified Map object which may be null.
     **/
    public RenderingHintsImpl(Map<RenderingHints.Key, ?> init)
    {
        renderingHints = new RenderingHints(init);
    }
 
    /** Constructs a new object with the specified key/value pair. **/
    public RenderingHintsImpl(RenderingHints.Key key, Object value)
    {
        renderingHints = new RenderingHints(key, value);
    }
 
    /**
     * Adds all of the keys and corresponding values from the specified
     * RenderingHints object to this RenderingHints object.
     **/
    public void add(RenderingHints hints)
    {
        renderingHints.add(hints);
    }
 
    /** Clears this RenderingHints object of all key/value pairs. **/
    public void clear()
    {
        renderingHints.clear();
    }
 
    /**
     * Creates a clone of this RenderingHints object that has the same contents
     * as this RenderingHints object.
     **/
    public Object clone()
    {
        return renderingHints.clone();
    }
 
    /** Returns true if this RenderingHints contains a mapping for the specified key. **/
    public boolean containsKey(Object key)
    {
        return renderingHints.containsKey(key);
    }
 
    /** Returns true if this RenderingHints maps one or more keys to the specified value. **/
    public boolean containsValue(Object value)
    {
        return renderingHints.containsValue(value);
    }
 
    /** Returns a Set view of the mappings contained in this RenderingHints. **/
    public Set<Map.Entry<Object, Object>> entrySet()
    {
        return renderingHints.entrySet();
    }
 
    /** Returns the value to which the specified key is mapped. **/
    public Object get(Object key)
    {
        return renderingHints.get(key);
    }
 
    /** Returns true if this RenderingHints contains no key-value mappings. **/
    public boolean isEmpty()
    {
        return renderingHints.isEmpty();
    }
 
    /** Returns a Set view of the Keys contained in this RenderingHints. **/
    public Set<Object> keySet()
    {
        return renderingHints.keySet();
    }
 
    /** Maps the specified key to the specified value in this RenderingHints object. **/
    public Object put(Object key, Object value)
    {
        return renderingHints.put(key, value);
    }
 
    /** Copies all of the mappings from the specified Map to this RenderingHints. **/
    public void putAll(Map<?, ?> m)
    {
        renderingHints.putAll(m);
    }
 
    /** Removes the key and its corresponding value from this RenderingHints object. **/
    public Object remove(Object key)
    {
        return renderingHints.remove(key);
    }
 
    /** Returns the number of key-value mappings in this RenderingHints. **/
    public int size()
    {
        return renderingHints.size();
    }
 
    /** Returns a Collection view of the values contained in this RenderinHints. **/
    public Collection<Object> values()
    {
        return renderingHints.values();
    }
}
