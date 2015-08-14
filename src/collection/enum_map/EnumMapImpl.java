package collection.enum_map;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumMapImpl<K extends Enum<K>, V> {
	
	private EnumMap<K, V> enumMap;
	 
    /** Creates an empty enum map with the specified key type. **/
    public EnumMapImpl(Class<K> keyType)
    {
        enumMap = new EnumMap<K, V>(keyType);
    }
 
    /**
     * Creates an enum map with the same key type as the specified enum map,
     * initially containing the same mappings (if any).
     **/
    public EnumMapImpl(EnumMap<K, ? extends V> m)
    {
        enumMap = new EnumMap<K, V>(m);
    }
 
    /** Creates an enum map initialized from the specified map. **/
    public EnumMapImpl(Map<K, ? extends V> m)
    {
        enumMap = new EnumMap<K, V>(m);
    }
 
    /** Removes all of the mappings from this map. **/
    public void clear()
    {
        enumMap.clear();
    }
 
    /** Returns true if this map contains a mapping for the specified key. **/
    public boolean containsKey(Object key)
    {
        return enumMap.containsKey(key);
    }
 
    /** Returns true if this map maps one or more keys to the specified value. **/
    public boolean containsValue(Object value)
    {
        return enumMap.containsValue(value);
    }
 
    /** Returns a Set view of the mappings contained in this map. **/
    public Set<Map.Entry<K, V>> entrySet()
    {
        return enumMap.entrySet();
    }
 
    /** Returns a Set view of the keys contained in this map. **/
    public Set<K> keySet()
    {
        return enumMap.keySet();
    }
 
    /**
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     **/
    public V get(Object key)
    {
        return enumMap.get(key);
    }
 
    /** Associates the specified value with the specified key in this map. **/
    public V put(K key, V value)
    {
        return enumMap.put(key, value);
    }
 
    /** Copies all of the mappings from the specified map to this map. **/
    public void putAll(Map<? extends K, ? extends V> map)
    {
        enumMap.putAll(map);
    }
 
    /** Removes the mapping for this key from this TreeMap if present. **/
    public V remove(Object key)
    {
        return enumMap.remove(key);
    }
 
    /** Returns the number of key-value mappings in this map. **/
    public int size()
    {
        return enumMap.size();
    }
 
    /** Returns a Collection view of the values contained in this map. **/
    public Collection<V> values()
    {
        return enumMap.values();
    }
 
    /** Returns true if this map contains no key-value mappings. **/
    public boolean isEmpty()
    {
        return enumMap.isEmpty();
    }
 
    public enum NUMBER
    {
        FIRST, SECOND, THIRD, FOURTH;
    }

}
