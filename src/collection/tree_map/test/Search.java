package collection.tree_map.test;

public class Search<K, V> {
	private TreeMapStorage<K, V> treeMapStorage;
	
	public Search() {
		treeMapStorage = new TreeMapStorage<>();
	}
	
	public TreeMapStorage<K, V> getTreeMapStorage() {
		return treeMapStorage;
	}



	public void setTreeMapStorage(TreeMapStorage<K, V> treeMapStorage) {
		this.treeMapStorage = treeMapStorage;
	}



	public void searchStudent(K k) {
		System.out.println(treeMapStorage.getStudentTreeMap().get(k));
	}
}
