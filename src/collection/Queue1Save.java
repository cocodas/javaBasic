package collection;

import java.util.LinkedList;

public class Queue1Save implements Queue1Inter {
	
	public static void save(String input) {
		//queue�� �����Ѵ�.
		if (!"".equals(input))
			q.offer(input);
		
		//queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if (((LinkedList)q).size() > MAX_SIZE)
			q.remove();
	}
}
