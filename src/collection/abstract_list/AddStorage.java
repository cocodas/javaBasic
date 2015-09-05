package collection.abstract_list;

public class AddStorage<T> implements OperateStorage<T> {
	
	private AbstractListStorage<T> abstractListStorage;
	
	public AddStorage() {
		abstractListStorage = new AbstractListStorage<T>();
	}

	@Override
	public void execute(int i,T t) {
		abstractListStorage.getAbstractListTest().add(i,t);
		
	}

	@Override
	public void display() {
		abstractListStorage.display();
	}

	public AbstractListStorage<T> getAbstractListStorage() {
		return abstractListStorage;
	}

	public void setAbstractListStorage(AbstractListStorage<T> abstractListStorage) {
		this.abstractListStorage = abstractListStorage;
	}
	
}
