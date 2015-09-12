package nio2.chapter02;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Set;

public class ViewTestMain {

	public static void main(String[] args) {
		/*
		 * view�� �Ӽ��� �����ϱ� ���� ���� ���� �ý����� �ش� �並 �����ϴ��� Ȯ���ؾ��Ѵ�.
		 * �̸����� �����ϴ� ���� ��ü ��� ��ȸ�� ���� �����(partition, divice volume�� 
		 * ���� ����� Ÿ���� ������ FileStore class�� ǥ���Ѵ�)�� Ư�� �並 �����ϴ��� 
		 * �˻��� �� �ִ�.
		 * 
		 * �⺻ ���� �ý��ۿ� ���� ����: FileSystems.getDefault();
		 * ���� �信 ���� �Ӽ� ����(���ͷ�����): FileSystem.supportedFileAttributeViews();
		 */
		FileSystem fs = FileSystems.getDefault();
		Set<String> views = fs.supportedFileAttributeViews();
		
		for (String view : views) {
			System.out.println(view);
		}
	}

}
