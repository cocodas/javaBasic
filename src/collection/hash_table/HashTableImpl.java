package collection.hash_table;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableImpl<K, V> {
	
	private Hashtable<K, V> hashTable;
	 
    /*
     * Constructs a new, empty hashtable with a default initial capacity (11)
     * and load factor (0.75).
     */
    public HashTableImpl()
    {
        hashTable = new Hashtable<K, V>();
    }
 
    /*
     * Constructs a new, empty hashtable with the specified initial capacity and
     * default load factor (0.75).
     */
    public HashTableImpl(int initialCapacity)
    {
        hashTable = new Hashtable<K, V>(initialCapacity);
    }
 
    /*
     * Constructs a new, empty hashtable with the specified initial capacity and
     * the specified load factor.
     */
    public HashTableImpl(int initialCapacity, float loadFactor)
    {
        hashTable = new Hashtable<K, V>(initialCapacity, loadFactor);
    }
 
    /* Constructs a new hashtable with the same mappings as the given Map. */
    public HashTableImpl(Map<? extends K, ? extends V> t)
    {
        hashTable = new Hashtable<K, V>(t);
    }
 
    /* Clears this hashtable so that it contains no keys. */
    public void clear()
    {
        hashTable.clear();
    }
 
    /* Creates a shallow copy of this hashtable. */
    public Object clone()
    {
        return hashTable.clone();
    }
 
    /* Tests if some key maps into the specified value in this hashtable. */
    public boolean contains(Object value)
    {
        return hashTable.contains(value);
    }
 
    /* Returns true if this hashtable maps one or more keys to this value. */
    public boolean containsValue(Object value)
    {
        return hashTable.containsValue(value);
    }
 
    /* Tests if the specified object is a key in this hashtable. */
    public boolean containsKey(Object key)
    {
        return hashTable.containsKey(key);
    }
 
    /* Returns an enumeration of the values in this hashtable. */
    public Enumeration<V> elements()
    {
        return hashTable.elements();
    }
 
    /* Returns an enumeration of the values in this hashtable. */
    public Set<Map.Entry<K, V>> entrySet()
    {
        return hashTable.entrySet();
    }
 
    /*
     * Compares the specified Object with this Map for equality, as per the
     * definition in the Map interface.
     */
    public boolean equals(Object o)
    {  
        return hashTable.equals(o);
    }
 
    /*
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     */
    public V get(Object key)
    {
        return hashTable.get(key);
    }
 
    /*
     * Returns the hash code value for this Map as per the definition in the Map
     * interface.
     */
    public int hashCode()
    {
        return hashTable.hashCode();
    }
 
    /* Tests if this hashtable maps no keys to values. */
    public boolean isEmpty()
    {
        return hashTable.isEmpty();
    }
 
    /* Returns an enumeration of the keys in this hashtable. */
    public Enumeration<K> keys()
    {
        return hashTable.keys();
    }
 
    /* Returns a Set view of the keys contained in this map. */
    public Set<K> keySet()
    {
        return hashTable.keySet();
    }
 
    /* Maps the specified key to the specified value in this hashtable. */
    public V put(K key, V value)
    {
        return hashTable.put(key, value);
    }
 
    /* Returns the number of keys in this hashtable. */
    public int size()
    {
        return hashTable.size();
    }
 
    /*
     * Returns a string representation of this Hashtable object in the form of a
     * set of entries, enclosed in braces and separated by the ASCII characters
     * ", " (comma and space).
     */
    public String toString()
    {
        return hashTable.toString();
    }
 
    /* Removes the key (and its corresponding value) from this hashtable. */
    public V remove(Object key)
    {
        return hashTable.remove(key);
    }
 
    /* Returns a Collection view of the values contained in this map. */
    public Collection<V> values()
    {
        return hashTable.values();
    }

}
