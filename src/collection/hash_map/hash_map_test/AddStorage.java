package collection.hash_map.hash_map_test;

public class AddStorage<K, V> implements OperateStorage<K, V> {
	
	private HashMapStorage<K, V> hashMapStorage;
	
	public AddStorage() {
		hashMapStorage = new HashMapStorage<K, V>();
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
		hashMapStorage.getHashMapFruit().put(k, v);
	}

	@Override
	public void vegetableExecute(K k, V v) {
		hashMapStorage.getHashMapVegetable().put(k, v);
	}

	@Override
	public void snackExecute(K k, V v) {
		hashMapStorage.getHashMapSnack().put(k, v);
	}


	@Override
	public V fruitRemove(K k) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public V vegetableRemove(K k) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public V snackRemove(K k) {
		// TODO Auto-generated method stub
		return null;
	}

}
