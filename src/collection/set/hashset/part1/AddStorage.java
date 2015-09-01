package collection.set.hashset.part1;

public class AddStorage<T> implements OperateStorage<T> {
	private HashSetStorage<T> hashSetStorage;

	public AddStorage() {
		hashSetStorage = new HashSetStorage<T>();
	}

	@Override
	public void execute (T t) {
		hashSetStorage.getHashSetStudent().add(t);
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
