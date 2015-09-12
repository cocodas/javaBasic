package nio2.chapter01;

import java.io.File;
import java.io.IOException;

public class FileTest01Main {

	public static void main(String[] args) {
		// FileTest project �������� filefolder est.txt ������ ��ü�� �����Ѵ�.
		// �� �̽������� ���ڷ� �νĵǹǷ� \\ -> \ �� ����Ѵ�.
		File file = new File("d:\\test.txt");

		// ��ο� ������ �����ϸ�
		if (file.exists()) {

			try {

				System.out.println("getName: " + file.getName()); // ���� �̸� ���
				System.out.println("getPath: " + file.getPath()); // ���� ��� ���
				// ���� ���� ��� ���
				System.out.println("getAbsolutePath : "
						+ file.getAbsolutePath());
				// ���� ���� ��� ���
				System.out.println("getCanonicalPath : "
						+ file.getCanonicalPath());
				// ���� ���� ���
				System.out.println("getParent : " + file.getParent());

				// ������ ����/�б� ���� üũ
				if (file.canWrite())
					System.out.println(file.getName() + "�� �� �� �ֽ��ϴ�.");
				if (file.canRead())
					System.out.println(file.getName() + "�� ���� �� �ֽ��ϴ�.");

				// ��ü�� ����, ���� ���� üũ
				if (file.isFile()) {
					System.out.println(file.getName() + "�� �����Դϴ�.");
				} else if (file.isDirectory()) {
					System.out.println(file.getName() + "�� �����Դϴ�.");
				} else {
					System.out.println(file.getName() + "�� ���ϵ� ������ �ƴմϴ�.");
				}

				// ���� ���� ���� ���
				System.out.println(file.getName() + "�� ���̴� " + file.length()
						+ " �Դϴ�.");

			} catch (IOException e) {
				System.err.println(e);
			}

		} else {
			System.out.println("������ ã�� �� �����ϴ�. ");
		}
	}
}