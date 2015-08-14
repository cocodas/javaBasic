package collection.set.hashset.part1;

import java.util.HashSet;
import java.util.Set;

public class HashSetStorage<T> {
	Set<T> hashSetStudent;

	public HashSetStorage() {
		hashSetStudent = new HashSet<T>();
	}

	public Set<T> getHashSetStudent() {
		return hashSetStudent;
	}

	public void setHashSetStudent(Set<T> hashSetStudent) {
		this.hashSetStudent = hashSetStudent;
	}

	public void display() {
		if (hashSetStudent.size() > 0) {
			for (T t : hashSetStudent) {
				System.out.println(t);
			}
		} else {
			System.out.println("저장된 데이터가 없습니다.");
		}
	}
}
