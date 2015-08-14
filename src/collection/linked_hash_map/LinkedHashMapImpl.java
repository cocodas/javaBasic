package collection.linked_hash_map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapImpl<K, V> {

	 private LinkedHashMap<K, V> linkedHashMap;
	 
	    /*
	     * Constructs an empty insertion-ordered LinkedHashMap instance with the
	     * default initial capacity (16) and load factor (0.75).
	     */
	    public LinkedHashMapImpl()
	    {
	        linkedHashMap = new LinkedHashMap<K, V>();
	    }
	 
	    /*
	     * Constructs an empty insertion-ordered LinkedHashMap instance with the
	     * specified initial capacity and a default load factor (0.75).
	     */
	    public LinkedHashMapImpl(int initialCapacity)
	    {
	        linkedHashMap = new LinkedHashMap<K, V>(initialCapacity);
	    }
	 
	    /*
	     * Constructs an empty insertion-ordered LinkedHashMap instance with the
	     * specified initial capacity and load factor.
	     */
	    public LinkedHashMapImpl(int initialCapacity, float loadFactor)
	    {
	        linkedHashMap = new LinkedHashMap<K, V>(initialCapacity, loadFactor);
	    }
	 
	    /*
	     * Constructs an empty LinkedHashMap instance with the specified initial
	     * capacity, load factor and ordering mode.
	     */
	    public LinkedHashMapImpl(int initialCapacity, float loadFactor, boolean accessOrder)
	    {
	        linkedHashMap = new LinkedHashMap<K, V>(initialCapacity, loadFactor, accessOrder);
	    }
	 
	    /*
	     * Constructs an insertion-ordered LinkedHashMap instance with the same
	     * mappings as the specified map.
	     */
	    public LinkedHashMapImpl(Map<? extends K, ? extends V> m)
	    {
	        linkedHashMap = new LinkedHashMap<K, V>(m);
	    }
	 
	    /* Removes all of the mappings from this map. */
	    public void clear()
	    {
	        linkedHashMap.clear();
	    }
	 
	    /*
	     * Returns a shallow copy of this LinkedHashMap instance: the keys and values
	     * themselves are not cloned.
	     */
	    public Object clone()
	    {
	        return linkedHashMap.clone();
	    }
	 
	    /* Returns true if this map contains a mapping for the specified key. */
	    public boolean containsKey(Object key)
	    {
	        return linkedHashMap.containsKey(key);
	    }
	 
	    /* Returns true if this map maps one or more keys to the specified value. */
	    public boolean containsValue(Object value)
	    {
	        return linkedHashMap.containsValue(value);
	    }
	 
	    /* Returns a Set view of the mappings contained in this map. */
	    public Set<Map.Entry<K, V>> entrySet()
	    {
	        return linkedHashMap.entrySet();
	    }
	 
	    /*
	     * Returns the value to which the specified key is mapped, or null if this
	     * map contains no mapping for the key.
	     */
	    public V get(Object key)
	    {
	        return linkedHashMap.get(key);
	    }
	 
	    /* Returns true if this map contains no key-value mappings. */
	    public boolean isEmpty()
	    {
	        return linkedHashMap.isEmpty();
	    }
	 
	    /* Returns a Set view of the keys contained in this map. */
	    public Set<K> keySet()
	    {
	        return linkedHashMap.keySet();
	    }
	 
	    /* Associates the specified value with the specified key in this map. */
	    public V put(K key, V value)
	    {
	        return linkedHashMap.put(key, value);
	    }
	 
	    /* Copies all of the mappings from the specified map to this map. */
	    public void putAll(Map<? extends K, ? extends V> m)
	    {
	        linkedHashMap.putAll(m);
	    }
	 
	    /* Removes the mapping for the specified key from this map if present. */
	    public V remove(Object key)
	    {
	        return linkedHashMap.remove(key);
	    }
	 
	    /* Returns the number of key-value mappings in this map. */
	    public int size()
	    {
	        return linkedHashMap.size();
	    }
	 
	    /* Returns a Collection view of the values contained in this map. */
	    public Collection<V> values()
	    {
	        return linkedHashMap.values();
	    }
}
