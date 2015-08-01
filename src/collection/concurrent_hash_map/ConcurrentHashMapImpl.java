package collection.concurrent_hash_map;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl<K, V> {
	private ConcurrentHashMap<K, V> concurrentHashMap;

	public ConcurrentHashMapImpl() {
		concurrentHashMap = new ConcurrentHashMap<K, V>();
	}

	public ConcurrentHashMapImpl(int initialCapacity) {
		concurrentHashMap = new ConcurrentHashMap<K, V>(initialCapacity);
	}

	public ConcurrentHashMapImpl(int initialCapacity, float loadFactor) {
		concurrentHashMap = new ConcurrentHashMap<K, V>(initialCapacity,
				loadFactor);
	}

	public ConcurrentHashMapImpl(int initialCapacity, float loadFactor,
			int concurrencyLevel) {
		concurrentHashMap = new ConcurrentHashMap<K, V>(initialCapacity,
				loadFactor, concurrencyLevel);
	}

	public ConcurrentHashMapImpl(Map<? extends K, ? extends V> m) {
		concurrentHashMap = new ConcurrentHashMap<K, V>(m);
	}

	public void clear() {
		concurrentHashMap.clear();
	}

	public boolean containsKey(Object key) {
		return concurrentHashMap.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return concurrentHashMap.containsValue(value);
	}

	public Set<Map.Entry<K, V>> entrySet() {
		return concurrentHashMap.entrySet();
	}

	public V get(Object key) {
		return concurrentHashMap.get(key);
	}

	public boolean isEmpty() {
		return concurrentHashMap.isEmpty();
	}

	public Set<K> keySet() {
		return concurrentHashMap.keySet();
	}

	public V put(K key, V value) {
		return concurrentHashMap.put(key, value);
	}

	public void putAll(Map<? extends K, ? extends V> m) {
		concurrentHashMap.putAll(m);
	}

	public V remove(Object key) {
		return concurrentHashMap.remove(key);
	}

	public int size() {
		return concurrentHashMap.size();
	}

	public Collection<V> values() {
		return concurrentHashMap.values();
	}

	public Enumeration<V> elements() {
		return concurrentHashMap.elements();
	}

	public V putIfAbsent(K key, V value) {
		return concurrentHashMap.putIfAbsent(key, value);
	}

	public V replace(K key, V value) {
		return concurrentHashMap.replace(key, value);
	}

	public boolean replace(K key, V oldValue, V newValue) {
		return concurrentHashMap.replace(key, oldValue, newValue);
	}
}
