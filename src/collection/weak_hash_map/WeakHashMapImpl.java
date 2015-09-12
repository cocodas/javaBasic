package collection.weak_hash_map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMapImpl<K, V> {
	
	private WeakHashMap<K, V> weakHashMap;
	 
    /**
     * Constructs a new, empty WeakHashMap with the default initial capacity
     * (16) and load factor (0.75).
     **/
    public WeakHashMapImpl()
    {
        weakHashMap = new WeakHashMap<K, V>();
    }
 
    /**
     * Constructs a new, empty WeakHashMap with the given initial capacity and
     * the default load factor (0.75).
     **/
    public WeakHashMapImpl(int initialCapacity)
    {
        weakHashMap = new WeakHashMap<K, V>(initialCapacity);
    }
 
    /**
     * Constructs a new, empty WeakHashMap with the given initial capacity and
     * the given load factor.
     **/
    public WeakHashMapImpl(int initialCapacity, float loadFactor)
    {
        weakHashMap = new WeakHashMap<K, V>(initialCapacity, loadFactor);
    }
 
    /** Constructs a new WeakHashMap with the same mappings as the specified map. **/
    public WeakHashMapImpl(Map<? extends K, ? extends V> m)
    {
        weakHashMap = new WeakHashMap<K, V>(m);
    }
 
    /** Removes all of the mappings from this map. **/
    public void clear()
    {
        weakHashMap.clear();
    }
 
    /** Returns true if this map contains a mapping for the specified key. **/
    public boolean containsKey(Object key)
    {
        return weakHashMap.containsKey(key);
    }
 
    /** Returns true if this map maps one or more keys to the specified value. **/
    public boolean containsValue(Object value)
    {
        return weakHashMap.containsValue(value);
    }
 
    /** Returns a Set view of the mappings contained in this map. **/
    public Set<Map.Entry<K, V>> entrySet()
    {
        return weakHashMap.entrySet();
    }
 
    /** Returns a Set view of the keys contained in this map. **/
    public Set<K> keySet()
    {
        return weakHashMap.keySet();
    }
 
    /**
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     **/
    public V get(Object key)
    {
        return weakHashMap.get(key);
    }
 
    /** Associates the specified value with the specified key in this map. **/
    public V put(K key, V value)
    {
        return weakHashMap.put(key, value);
    }
 
    /** Copies all of the mappings from the specified map to this map. **/
    public void putAll(Map<? extends K, ? extends V> map)
    {
        weakHashMap.putAll(map);
    }
 
    /** Removes the mapping for this key from this TreeMap if present. **/
    public V remove(Object key)
    {
        return weakHashMap.remove(key);
    }
 
    /** Returns the number of key-value mappings in this map. **/
    public int size()
    {
        return weakHashMap.size();
    }
 
    /** Returns a Collection view of the values contained in this map. **/
    public Collection<V> values()
    {
        return weakHashMap.values();
    }
 
    /** Returns true if this map contains no key-value mappings. **/
    public boolean isEmpty()
    {
        return weakHashMap.isEmpty();
    }

}
