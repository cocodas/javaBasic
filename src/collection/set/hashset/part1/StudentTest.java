package collection.set.hashset.part1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		Student student = new Student.StudentBuilder().age(22).entryNumber(01).gender("male").subject("Computer Science").name("ȫ�浿").grade(2).builder();
		assertEquals(student.getAge(), 22);
	}

}
