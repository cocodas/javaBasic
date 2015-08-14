package collection.set.hashset.part1;

public class HashSet1Main {

	public static void main(String[] args) {
		AddStorage<Student> add = new AddStorage<Student>();
		RemoveStorage<Student> remove = new RemoveStorage<Student>();
		add.execute(new Student.StudentBuilder().age(22).entryNumber(01).gender("male").grade(2).name("ȫ�浿").subject("��ǻ�� ����").builder());
		add.execute(new Student.StudentBuilder().age(21).entryNumber(02).gender("female").grade(2).name("ȫ���").subject("��ǻ�� ����").builder());
		add.execute(new Student.StudentBuilder().age(23).entryNumber(04).gender("male").grade(2).name("ȫ�漭").subject("��ǻ�� ����").builder());
		add.display();
		remove.setHashSetStorage(add.getHashSetStorage());
		Student key = new Student.StudentBuilder().age(21).entryNumber(02).gender("female").grade(2).name("ȫ���").subject("��ǻ�� ����").builder();
		remove.execute(key);
		remove.display();
	}

}
