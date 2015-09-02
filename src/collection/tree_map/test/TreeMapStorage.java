package collection.tree_map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapStorage<K, V> {
	Map<K, V> studentTreeMap;
	Map<K, V> mathTreeMap;
	Map<K, V> eglishTreeMap;
	Map<K, V> scienceTreeMap;
	Map<K, V> koreanTreeMap;
	
	public TreeMapStorage() {
		studentTreeMap = new TreeMap<>();
		mathTreeMap = new TreeMap<>();
		eglishTreeMap = new TreeMap<>();
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

	public Map<K, V> getEglishTreeMap() {
		return eglishTreeMap;
	}

	public void setEglishTreeMap(Map<K, V> eglishTreeMap) {
		this.eglishTreeMap = eglishTreeMap;
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
	
	public void display() {
		if (studentTreeMap.size() > 0) {
			Set<K> set = studentTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(studentTreeMap.get(itr.next()));
			}
		}
		
		if (mathTreeMap.size() > 0) {
			Set<K> set = mathTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(mathTreeMap.get(itr.next()));
			}
		}
		
		if (eglishTreeMap.size() > 0) {
			Set<K> set = eglishTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(eglishTreeMap.get(itr.next()));
			}
		}
		
		if (scienceTreeMap.size() > 0) {
			Set<K> set = scienceTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(scienceTreeMap.get(itr.next()));
			}
		}
		
		if (koreanTreeMap.size() > 0 ) {
			Set<K> set = koreanTreeMap.keySet();
			Iterator<K> itr = set.iterator();
			
			while (itr.hasNext()) {
				System.out.print(koreanTreeMap.get(itr.next()));
			}
		}
	}
	
	

}
