package collection.array_list.test;

public class RemoveStorage<E> implements OperateStorage<E> {
	private ArrayListStorage<E> arrayListStorage;
	
	public RemoveStorage() {
		arrayListStorage = new ArrayListStorage<E>();
	}

	@Override
	public void execute(E e) {
		arrayListStorage.getArrayListStorage().remove(e);
		
	}

	@Override
	public void display() {
		arrayListStorage.display();
	}

	public void setArrayListStorage(ArrayListStorage<E> arrayListStorage) {
		this.arrayListStorage = arrayListStorage;
	}

	public ArrayListStorage<E> getArrayListStorage() {
		return arrayListStorage;
	}

	@Override
	public void execute(int i) {
		arrayListStorage.getArrayListStorage().remove(i);
	}
	
	
}
