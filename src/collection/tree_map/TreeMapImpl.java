package collection.tree_map;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapImpl<K, V> {
	
	private TreeMap<K, V> treeMap;
	 
    /** Constructs a new, empty tree map, using the natural ordering of its keys. **/
    public TreeMapImpl()
    {
        treeMap = new TreeMap<K, V>();
    }
 
    /**
     * Constructs a new, empty tree map, ordered according to the given
     * comparator.
     **/
    public TreeMapImpl(Comparator<? super K> comparator)
    {
        treeMap = new TreeMap<K, V>(comparator);
    }
 
    /**
     * Constructs a new tree map containing the same mappings as the given map,
     * ordered according to the natural ordering of its keys.
     **/
    public TreeMapImpl(Map<? extends K, ? extends V> m)
    {
        treeMap = new TreeMap<K, V>(m);
    }
 
    /**
     * Constructs a new tree map containing the same mappings and using the same
     * ordering as the specified sorted map.
     **/
    public TreeMapImpl(SortedMap<K, ? extends V> m)
    {
        treeMap = new TreeMap<K, V>(m);
    }
 
    /**
     * Returns a key-value mapping associated with the least key greater than or
     * equal to the given key, or null if there is no such key.
     **/
    public Map.Entry<K, V> ceilingEntry(K key)
    {
        return treeMap.ceilingEntry(key);
    }
 
    /**
     * Returns the least key greater than or equal to the given key, or null if
     * there is no such key.
     **/
    public K ceilingKey(K key)
    {
        return treeMap.ceilingKey(key);
    }
 
    /** Removes all of the mappings from this map. **/
    public void clear()
    {
        treeMap.clear();
    }
 
    /** Returns a shallow copy of this TreeMap instance. **/
    public Object clone()
    {
        return treeMap.clone();
    }
 
    /**
     * Returns the comparator used to order the keys in this map, or null if
     * this map uses the natural ordering of its keys.
     **/
    public Comparator<? super K> comparator()
    {
        return treeMap.comparator();
    }
 
    /** Returns true if this map contains a mapping for the specified key. **/
    public boolean containsKey(Object key)
    {
        return treeMap.containsKey(key);
    }
 
    /** Returns true if this map maps one or more keys to the specified value. **/
    public boolean containsValue(Object value)
    {
        return treeMap.containsValue(value);
    }
 
    /**
     * Returns a reverse order NavigableSet view of the keys contained in this
     * map.
     **/
    public NavigableSet<K> descendingKeySet()
    {
        return treeMap.descendingKeySet();
    }
 
    /** Returns a reverse order view of the mappings contained in this map. **/
    public NavigableMap<K, V> descendingMap()
    {
        return treeMap.descendingMap();
    }
 
    /** Returns a Set view of the mappings contained in this map. **/
    public Set<Map.Entry<K, V>> entrySet()
    {
        return treeMap.entrySet();
    }
 
    /**
     * Returns a key-value mapping associated with the least key in this map, or
     * null if the map is empty.
     **/
    public Map.Entry<K, V> firstEntry()
    {
        return treeMap.firstEntry();
    }
 
    /** Returns the first (lowest) key currently in this map. **/
    public K firstKey()
    {
        return treeMap.firstKey();
    }
 
    /**
     * Returns the greatest key less than or equal to the given key, or null if
     * there is no such key.
     **/
    public K floorKey(K key)
    {
        return treeMap.floorKey(key);
    }
 
    /**
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     **/
    public V get(Object key)
    {
        return treeMap.get(key);
    }
 
    /**
     * Returns a view of the portion of this map whose keys are strictly less
     * than toKey.
     **/
    public SortedMap<K, V> headMap(K toKey)
    {
        return treeMap.headMap(toKey);
    }
 
    /**
     * Returns a view of the portion of this map whose keys are less than (or
     * equal to, if inclusive is true) toKey.
     **/
    public NavigableMap<K, V> headMap(K toKey, boolean inclusive)
    {
        return treeMap.headMap(toKey, inclusive);
    }
 
    /**
     * Returns a key-value mapping associated with the least key strictly
     * greater than the given key, or null if there is no such key.
     **/
    public Map.Entry<K, V> higherEntry(K key)
    {
        return treeMap.higherEntry(key);
    }
 
    /**
     * Returns the least key strictly greater than the given key, or null if
     * there is no such key.
     **/
    public K higherKey(K key)
    {
        return treeMap.higherKey(key);
    }
 
    /** Returns a Set view of the keys contained in this map. **/
    public Set<K> keySet()
    {
        return treeMap.keySet();
    }
 
    /**
     * Returns a key-value mapping associated with the greatest key in this map,
     * or null if the map is empty.
     **/
    public Map.Entry<K, V> lastEntry()
    {
        return treeMap.lastEntry();
    }
 
    /** Returns the last (highest) key currently in this map. **/
    public K lastKey()
    {
        return treeMap.lastKey();
    }
 
    /**
     * Returns a key-value mapping associated with the greatest key strictly
     * less than the given key, or null if there is no such key.
     **/
    public Map.Entry<K, V> lowerEntry(K key)
    {
        return treeMap.lowerEntry(key);
    }
 
    /**
     * Returns the greatest key strictly less than the given key, or null if
     * there is no such key.
     **/
    public K lowerKey(K key)
    {
        return treeMap.lowerKey(key);
    }
 
    /** Returns a NavigableSet view of the keys contained in this map. **/
    public NavigableSet<K> navigableKeySet()
    {
        return treeMap.navigableKeySet();
    }
 
    /**
     * Removes and returns a key-value mapping associated with the least key in
     * this map, or null if the map is empty.
     **/
    public Map.Entry<K, V> pollFirstEntry()
    {
        return treeMap.pollFirstEntry();
    }
 
    /**
     * Removes and returns a key-value mapping associated with the greatest key
     * in this map, or null if the map is empty.
     **/
    public Map.Entry<K, V> pollLastEntry()
    {
        return treeMap.pollLastEntry();
    }
 
    /** Associates the specified value with the specified key in this map. **/
    public V put(K key, V value)
    {
        return treeMap.put(key, value);
    }
 
    /** Copies all of the mappings from the specified map to this map. **/
    public void putAll(Map<? extends K, ? extends V> map)
    {
        treeMap.putAll(map);
    }
 
    /** Removes the mapping for this key from this TreeMap if present. **/
    public V remove(Object key)
    {
        return treeMap.remove(key);
    }
 
    /** Returns the number of key-value mappings in this map. **/
    public int size()
    {
        return treeMap.size();
    }
 
    /**
     * Returns a view of the portion of this map whose keys range from fromKey
     * to toKey.
     **/
    public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey,	boolean toInclusive)
    {
        return treeMap.subMap(fromKey, fromInclusive, toKey, toInclusive);
    }
 
    /**
     * Returns a view of the portion of this map whose keys range from fromKey,
     * inclusive, to toKey, exclusive.
     **/
    public SortedMap<K, V> subMap(K fromKey, K toKey)
    {
        return treeMap.subMap(fromKey, toKey);
    }
 
    /** Returns a Collection view of the values contained in this map. **/
    public Collection<V> values()
    {
        return treeMap.values();
    }
    
    public boolean isEmpty() {
		
    	return treeMap.isEmpty();
	}

}
