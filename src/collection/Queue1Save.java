package collection;

import java.util.LinkedList;

public class Queue1Save implements Queue1Inter {
	
	public static void save(String input) {
		//queue에 저장한다.
		if (!"".equals(input))
			q.offer(input);
		
		//queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if (((LinkedList)q).size() > MAX_SIZE)
			q.remove();
	}
}
