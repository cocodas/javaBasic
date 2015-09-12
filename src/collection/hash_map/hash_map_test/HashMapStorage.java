package collection.hash_map.hash_map_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStorage<K, V>{
	Map<K, V> hashMapFruit;
	Map<K, V> hashMapVegetable;
	Map<K, V> hashMapSnack;
	
	public HashMapStorage() {
		hashMapFruit = new HashMap<K,V>();
		hashMapVegetable = new HashMap<K, V>();
		hashMapSnack = new HashMap<K, V>();
	}
	
	
	public Map<K, V> getHashMapFruit() {
		return hashMapFruit;
	}


	public void setHashMapFruit(Map<K, V> hashMapFruit) {
		this.hashMapFruit = hashMapFruit;
	}


	public Map<K, V> getHashMapVegetable() {
		return hashMapVegetable;
	}


	public void setHashMapVegetable(Map<K, V> hashMapVegetable) {
		this.hashMapVegetable = hashMapVegetable;
	}


	public Map<K, V> getHashMapSnack() {
		return hashMapSnack;
	}


	public void setHashMapSnack(Map<K, V> hashMapSnack) {
		this.hashMapSnack = hashMapSnack;
	}


	public void display() {
		if (hashMapFruit.size()> 0) {
			Set<K> set = hashMapFruit.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(hashMapFruit.get(itr.next()));
			}
			//System.out.println(hashMapFruit.keySet());
			//System.out.println(hashMapFruit.get("µÎ¹øÂ°"));
		}
		
		if (hashMapVegetable.size() > 0) {
			Set<K> set = hashMapVegetable.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(hashMapVegetable.get(itr.next()));
			}
			
		}
		
		if (hashMapSnack.size() >0 ) {
			Set<K> set = hashMapSnack.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(hashMapSnack.get(itr.next()));
			}
		}
	}

}
