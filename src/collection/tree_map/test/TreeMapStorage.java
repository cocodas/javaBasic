package collection.tree_map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapStorage<K, V> {
	Map<K, V> studentTreeMap;
	Map<K, V> mathTreeMap;
	Map<K, V> englishTreeMap;
	Map<K, V> scienceTreeMap;
	Map<K, V> koreanTreeMap;
	
	public TreeMapStorage() {
		studentTreeMap = new TreeMap<>();
		mathTreeMap = new TreeMap<>();
		englishTreeMap = new TreeMap<>();
		scienceTreeMap = new TreeMap<>();
		koreanTreeMap = new TreeMap<>();
	}
	
	public Map<K, V> getStudentTreeMap() {
		return studentTreeMap;
	}



	public void setStudentTreeMap(Map<K, V> studentTreeMap) {
		this.studentTreeMap = studentTreeMap;
	}



	public Map<K, V> getMathTreeMap() {
		return mathTreeMap;
	}

	public void setMathTreeMap(Map<K, V> mathTreeMap) {
		this.mathTreeMap = mathTreeMap;
	}

	public Map<K, V> getEnglishTreeMap() {
		return englishTreeMap;
	}

	public void setEnglishTreeMap(Map<K, V> englishTreeMap) {
		this.englishTreeMap = englishTreeMap;
	}

	public Map<K, V> getScienceTreeMap() {
		return scienceTreeMap;
	}

	public void setScienceTreeMap(Map<K, V> scienceTreeMap) {
		this.scienceTreeMap = scienceTreeMap;
	}

	public Map<K, V> getKoreanTreeMap() {
		return koreanTreeMap;
	}

	public void setKoreanTreeMap(Map<K, V> koreanTreeMap) {
		this.koreanTreeMap = koreanTreeMap;
	}

	public void mathDisplay() {
		if (mathTreeMap.size() > 0) {
			Set<K> set = mathTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(mathTreeMap.get(itr.next()));
			}
		}
	}
	
	public void descendingMathDisplay() {
		if (mathTreeMap.size() > 0) {
			NavigableSet<K> navigableSet = ((TreeMap<K, V>) mathTreeMap).navigableKeySet(); 
			Iterator<K> itr = navigableSet.descendingIterator();
			
			while (itr.hasNext()) {
				System.out.print(mathTreeMap.get(itr.next()));
			}
		}
	}
	
	public void englisDisplay() {
		if (englishTreeMap.size() > 0) {
			Set<K> set = englishTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(englishTreeMap.get(itr.next()));
			}
		}
	}
	
	public void descendingEnglishDisplay() {
		if (englishTreeMap.size() > 0) {
			NavigableSet<K> navigableSet = ((TreeMap<K, V>) englishTreeMap).navigableKeySet(); 
			Iterator<K> itr = navigableSet.descendingIterator();
			
			while (itr.hasNext()) {
				System.out.print(englishTreeMap.get(itr.next()));
			}
		}
	}
	
	public void scienceDisplay() {
		if (scienceTreeMap.size() > 0) {
			Set<K> set = scienceTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(scienceTreeMap.get(itr.next()));
			}
		}
	}
	
	public void descendingScienceDisplay() {
		if (scienceTreeMap.size() > 0) {
			NavigableSet<K> navigableSet = ((TreeMap<K, V>) scienceTreeMap).navigableKeySet(); 
			Iterator<K> itr = navigableSet.descendingIterator();
			
			while (itr.hasNext()) {
				System.out.print(scienceTreeMap.get(itr.next()));
			}
		}
	}
	
	public void koreanDisplay() {
		if (koreanTreeMap.size() > 0 ) {
			Set<K> set = koreanTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(koreanTreeMap.get(itr.next()));
			}
		}
	}
	
	public void descendingKoreanDisplay() {
		if (koreanTreeMap.size() > 0) {
			NavigableSet<K> navigableSet = ((TreeMap<K, V>) koreanTreeMap).navigableKeySet(); 
			Iterator<K> itr = navigableSet.descendingIterator();
			
			while (itr.hasNext()) {
				System.out.print(koreanTreeMap.get(itr.next()));
			}
		}
	}

	public void display() {
		if (studentTreeMap.size() > 0) {
			Set<K> set = studentTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(studentTreeMap.get(itr.next()));
				System.out.println();
			}
		}
	}
}
