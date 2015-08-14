package collection.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl<K, V> {
	
	private HashMap<K, V> hashMap;
	 
    /*
     * Constructs an empty HashMap with the default initial capacity (16) and
     * the default load factor (0.75).
     */
    public HashMapImpl()
    {
        hashMap = new HashMap<K, V>();
    }
 
    /*
     * Constructs an empty HashMap with the specified initial capacity and the
     * default load factor (0.75).
     */
    public HashMapImpl(int initialCapacity)
    {
        hashMap = new HashMap<K, V>(initialCapacity);
    }
 
    /*
     * Constructs an empty HashMap with the specified initial capacity and load
     * factor.
     */
    public HashMapImpl(int initialCapacity, float loadFactor)
    {
        hashMap = new HashMap<K, V>(initialCapacity, loadFactor);
    }
 
    /* Constructs a new HashMap with the same mappings as the specified Map. */
    public HashMapImpl(Map<? extends K, ? extends V> m)
    {
        hashMap = new HashMap<K, V>(m);
    }
 
    /* Removes all of the mappings from this map. */
    public void clear()
    {
        hashMap.clear();
    }
 
    /*
     * Returns a shallow copy of this HashMap instance: the keys and values
     * themselves are not cloned.
     */
    public Object clone()
    {
        return hashMap.clone();
    }
 
    /* Returns true if this map contains a mapping for the specified key. */
    public boolean containsKey(Object key)
    {
        return hashMap.containsKey(key);
    }
 
    /* Returns true if this map maps one or more keys to the specified value. */
    public boolean containsValue(Object value)
    {
        return hashMap.containsValue(value);
    }
 
    /* Returns a Set view of the mappings contained in this map. */
    public Set<Map.Entry<K, V>> entrySet()
    {
        return hashMap.entrySet();
    }
 
    /*
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     */
    public V get(Object key)
    {
        return hashMap.get(key);
    }
 
    /* Returns true if this map contains no key-value mappings. */
    public boolean isEmpty()
    {
        return hashMap.isEmpty();
    }
 
    /* Returns a Set view of the keys contained in this map. */
    public Set<K> keySet()
    {
        return hashMap.keySet();
    }
 
    /* Associates the specified value with the specified key in this map. */
    public V put(K key, V value)
    {
        return hashMap.put(key, value);
    }
 
    /* Copies all of the mappings from the specified map to this map. */
    public void putAll(Map<? extends K, ? extends V> m)
    {
        hashMap.putAll(m);
    }
 
    /* Removes the mapping for the specified key from this map if present. */
    public V remove(Object key)
    {
        return hashMap.remove(key);
    }
 
    /* Returns the number of key-value mappings in this map. */
    public int size()
    {
        return hashMap.size();
    }
 
    /* Returns a Collection view of the values contained in this map. */
    public Collection<V> values()
    {
        return hashMap.values();
    }

}
