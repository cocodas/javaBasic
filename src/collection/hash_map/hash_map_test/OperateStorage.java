package collection.hash_map.hash_map_test;

public interface OperateStorage<K, V> {
	
	public void display();
	public void fruitExecute(K k, V v);
	public void vegetableExecute(K k, V v);
	public void snackExecute(K k, V v);
	V fruitRemove(K k);
	V vegetableRemove(K k);
	V snackRemove(K k);
	
}
