package collection.tree_map.test;

public class MathStorage<K, V> implements OperateStorage<K, V> {
	private TreeMapStorage<K, V> treeMapStorage;
	
	public MathStorage() {
		treeMapStorage = new TreeMapStorage<>();
	}

	public TreeMapStorage<K, V> getTreeMapStorage() {
		return treeMapStorage;
	}

	public void setTreeMapStorage(TreeMapStorage<K, V> treeMapStorage) {
		this.treeMapStorage = treeMapStorage;
	}

	@Override
	public void display() {
		treeMapStorage.display();
	}

	@Override
	public void execute(K k, V v) {
		treeMapStorage.getMathTreeMap().put(k, v);
	}
	
	
	
	
	
	
}
