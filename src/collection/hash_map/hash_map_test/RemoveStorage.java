package collection.hash_map.hash_map_test;

public class RemoveStorage<K, V> implements OperateStorage<K, V>{
	private HashMapStorage<K, V> hashMapStorage;
	
	public RemoveStorage() {
		hashMapStorage = new HashMapStorage<>();
	}

	public HashMapStorage<K, V> getHashMapStorage() {
		return hashMapStorage;
	}

	public void setHashMapStorage(HashMapStorage<K, V> hashMapStorage) {
		this.hashMapStorage = hashMapStorage;
	}

	@Override
	public void display() {
		hashMapStorage.display();
	}

	@Override
	public void fruitExecute(K k, V v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vegetableExecute(K k, V v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void snackExecute(K k, V v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V fruitRemove(K k) {
		return hashMapStorage.hashMapFruit.remove(k);
	}

	@Override
	public V vegetableRemove(K k) {
		return hashMapStorage.hashMapVegetable.remove(k);
	}

	@Override
	public V snackRemove(K k) {
		return hashMapStorage.hashMapSnack.remove(k);
	}



}
