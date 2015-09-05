package collection.tree_map.test;

public class AddStorage<K, V> implements OperateStorage<K, V>{

	private TreeMapStorage<K, V> treeMapStorage;
	
	public AddStorage() {
		treeMapStorage = new TreeMapStorage<>();
	}

	public TreeMapStorage<K, V> getTreeMapStorage() {
		return treeMapStorage;
	}

	public void setTreeMapStorage(TreeMapStorage<K, V> treeMapStorage) {
		this.treeMapStorage = treeMapStorage;
	}

	public void search(K k) {
		System.out.println(treeMapStorage.getStudentTreeMap().get(k));
	}

	public void addMathScore(K k, V v) {
		treeMapStorage.getMathTreeMap().put(k, v);
	}
	
	public void addEnglishScore(K k, V v) {
		treeMapStorage.getEnglishTreeMap().put(k, v);
	}
	
	public void addScienceScore(K k, V v) {
		treeMapStorage.getScienceTreeMap().put(k, v);
	}
	
	public void addKoreanScore(K k, V v) {
		treeMapStorage.getKoreanTreeMap().put(k, v);
	}
	
	public void mathSearch() {
		treeMapStorage.mathDisplay();
	}
	
	public void mathDescendingSearch() {
		treeMapStorage.descendingMathDisplay();
	}
	
	public void englishSearch() {
		treeMapStorage.englisDisplay();
	}
	
	public void englishDescendingSearch() {
		treeMapStorage.descendingEnglishDisplay();
	}
	
	public void scienceSearch() {
		treeMapStorage.scienceDisplay();
	}
	
	public void scienceDescendingSearch() {
		treeMapStorage.descendingScienceDisplay();
	}
	
	public void koreanSearch() {
		treeMapStorage.koreanDisplay();
	}
	
	public void koreanDescendingSearch() {
		treeMapStorage.descendingKoreanDisplay();
	}
	
	@Override
	public void display() {
		treeMapStorage.display();
	}

	@Override
	public void execute(K k, V v) {
		treeMapStorage.getStudentTreeMap().put(k, v);
	}
	
}
