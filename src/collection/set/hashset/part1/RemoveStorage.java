package collection.set.hashset.part1;

public class RemoveStorage<T> implements OperateStorage<T> {
	private HashSetStorage<T> hashSetStorage;

	public RemoveStorage() {
		hashSetStorage = new HashSetStorage<T>();
	}

	@Override
	public void execute(T t) {
		hashSetStorage.getHashSetStudent().remove(t);
	}

	@Override
	public void display() {
		hashSetStorage.display();
	}

	public void setHashSetStorage(HashSetStorage<T> hashSetStorage) {
		this.hashSetStorage = hashSetStorage;
	}

	public HashSetStorage<T> getHashSetStorage() {
		return hashSetStorage;
	}
	
}
