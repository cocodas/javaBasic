package collection.tree_map.test;

import java.util.Scanner;

public class Manager{

	String nameScan = "";
	int numberScan, mathScan, englishScan, scienceScan, koreanScan, gradeScan;
	int sum = mathScan + englishScan + scienceScan + koreanScan;
	float everage = sum/4;
	
	AddStorage<Integer, Student> addStudentScore = new AddStorage<Integer, Student>();
	
	public void start() {
		while (true) {
			System.out.println("���� ���� ���α׷��� ���� �մϴ�.");
			System.out.println("******* ��带 ���� �ϼ���. *******");
			System.out.println("1.���� ��� 2.�л� ���");
			
			Scanner modeScanner = new Scanner(System.in);
			int a = modeScanner.nextInt();
			
			switch (a) {
			case 1:
				System.out.println("******* ���� ��带 ���� �մϴ�. *******");
				System.out.println("1. ���� ���� ���� 2.���� ���� ���� 3.���� ���� ���� 4.���� ���� ����");
				
				Scanner scoreScaner = new Scanner(System.in);
				int b = scoreScaner.nextInt();
				
				switch (b) {
				case 1:
					
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;

				default:
					System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					break;
				}
				
				break;

			case 2:
				System.out.println("******* �л� ��带 ���� �մϴ�. *******");
				System.out.println("1.���� �Է� 2. ���� Ȯ��");
				
				Scanner studentScanner = new Scanner(System.in);
				int c = studentScanner.nextInt();
				
				switch (c) {
				case 1:
					System.out.println("���� �Է��� ���� �ϰڽ��ϴ�.");
					System.out.println("�̸��� �Է��� �ּ���.");
					
					Scanner nameScanner = new Scanner(System.in);
					nameScan = nameScanner.nextLine();
					
					System.out.println("�й��� �Է��� �ּ���.");
					
					Scanner numberScanner = new Scanner(System.in);
					numberScan = numberScanner.nextInt();
					
					System.out.println("�г��� �Է��� �ּ���.");
					
					Scanner gradeScanner = new Scanner(System.in);
					gradeScan = gradeScanner.nextInt();
					
					System.out.println("���� ������ �Է� �ϼ���.");
					
					Scanner mathScanner = new  Scanner(System.in);
					mathScan = mathScanner.nextInt();
					
					System.out.println("���� ������ �Է� �ϼ���.");
					
					Scanner englishScanner = new Scanner(System.in);
					englishScan = englishScanner.nextInt();
					
					System.out.println("���� ������ �Է� �ϼ���.");
					
					Scanner scienceScanner = new Scanner(System.in);
					scienceScan = scienceScanner.nextInt();
					
					System.out.println("���� ������ �Է� �ϼ���.");
					
					Scanner koreanScanner = new Scanner(System.in);
					koreanScan = koreanScanner.nextInt();
					
					addStudentScore.execute(numberScan, new Student.StudentBuilder().name(nameScan).studentNumber(numberScan).grade(gradeScan).mathScore(mathScan).englishScore(englishScan).scienceScore(scienceScan).koreanScore(koreanScan).builder());
					
					//addStudentScore.display();
					
					break;
				case 2:
					addStudentScore.display();
					System.out.println();

				default:
					break;
				}
				
				
				break;
				
			default:
				break;
			}
			//System.out.println("[ " + nameScan + " ]" + mathScan + ", " + englishScan + ", " + scienceScan + ", " + koreanScan);
		}
	}
}
