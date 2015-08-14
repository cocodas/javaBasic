package collection.copy_on_write_array_list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTestMain {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
		
		copyOnWriteArrayList.add("Java");
		copyOnWriteArrayList.add("CopyOnWriteArrayList");
		copyOnWriteArrayList.add("Collection");
		
		Iterator<String> failSafeIterator = copyOnWriteArrayList.listIterator();
		
		while (failSafeIterator.hasNext()) {
			System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
	
			//failSafeIterator.remove(); //CopyOnWriteArrayList���� remove�� ���� ���� �ʴ´�.
			//ArrayList�� �����忡 �����ϰ� ������� �ʾҴ�. �� ���п� ������� ������ ������ ó���� �ΰ��� ��� Vector�� ���ų� 
			//ArrayList�� ���鼭 synchroized�� �����ϰ� ����ؾ߸� �ߴ�. �׷��� �̷��� ����� ������ �����尡 �����ϰ� Ȥ��
			//�ʿ� �̻����� �� synchronized�� ���� ���߰ų� ��ٷ��߸� �ϴ� ��Ȳ�� ���߽�Ű�Ƿ� ���ɿ� ������ ������ ��ġ�⵵ �Ѵ�.
			//���� �̷��� ����� �ذ��� ���� �ϳ��� �ٷ� CopyOnWriteArrayList�̴�. CopyOnWriteArrayList�� �� �Ѱ���Ư¡����
			//�����ϸ� ArrayList�� �����ϴ�. CopyOnWriteArrayList�� �������� �б� ���� ��򰡿� �����Ҷ� CopyOnWriteArrayList��
			//�������� �����ؼ� �����Ѵ�. ���� CopyOnWriteArrayList�� ���� �پ��� �����忡�� �Ƚ��ϰ� ������ �ִ�. 
			//���� CopyOnWriteArrayList��  �ַ� ���� ���� ������� �ַ�  List�� �а� �Ҽ��� �����峪 �޼ҵ峻������ �ش� List�� �����ϴ� ��쿡 
			//������ ���̴�.
		}
		
	}

}
