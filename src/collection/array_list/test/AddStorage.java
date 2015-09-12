package collection.array_list.test;

public class AddStorage<E> implements OperateStorage<E> {
	
	private ArrayListStorage<E> arrayListStorage;
	
	public AddStorage() {
		arrayListStorage = new ArrayListStorage<E>();
	}

	@Override
	public void execute(E e) {
		arrayListStorage.getArrayListStorage().add(e);
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
		
	}
}
