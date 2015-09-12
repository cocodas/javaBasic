package collection.tree_map.test;

import java.util.Scanner;

public class Manager{

	String nameScan = "";
	int numberScan, mathScan, englishScan, scienceScan, koreanScan, gradeScan;
	//int sum = mathScan + englishScan + scienceScan + koreanScan;
	//float everage = sum/4;
	
	AddStorage<Integer, Student> addStudentScore = new AddStorage<Integer, Student>();
	//Search<Integer, Student> searchStudent = new Search<Integer, Student>();//Search Ŭ������ ���� ���� ���� �ϸ� �� �����Ͱ��� �ȵ�����??
	AddStorage<Integer, Math> addMath = new AddStorage<Integer, Math>();
	AddStorage<Integer, English> addEnglish = new AddStorage<Integer, English>();
	AddStorage<Integer, Science> addScience = new AddStorage<Integer, Science>();
	AddStorage<Integer, Korean> addKorean = new AddStorage<Integer, Korean>();
	
	public void start() {
		while (true) {
			System.out.println("���� ���� ���α׷��� ���� �մϴ�.");
			System.out.println("******* ��带 ���� �ϼ���. *******");
			System.out.println("1.���� ��� 2.�л� ���");
			
			Scanner modeScanner = new Scanner(System.in);
			int mode = modeScanner.nextInt();
			
			switch (mode) {
			case 1:
				System.out.println("******* ���� ��带 ���� �մϴ�. *******\n");
				System.out.println("1.���� ���� ���� 2.���� ���� ���� 3.���� ���� ���� 4.���� ���� ���� 5.�л� ��ü ����\n");
				
				Scanner scoreScanner = new Scanner(System.in);
				int teacherMode = scoreScanner.nextInt();
				
				switch (teacherMode) {
				case 1:
					System.out.println("1.���� ���� ���� �������� ���� 2.���� ���� ���� �������� ����\n ");
					
					Scanner mathScoreScanner = new Scanner(System.in);
					int mathScoreArray = mathScoreScanner.nextInt();
					
					switch (mathScoreArray) {
					case 1:
						System.out.println("===== ���� ���� �������� ��ȸ ��� =====\n");
						addMath.mathSearch();
						break;
					
					case 2:
						System.out.println("===== ���� ���� �������� ��ȸ ��� ===== \n");
						addMath.mathDescendingSearch();
						break;
						
					default:
						System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					break;
					
				case 2:
					System.out.println("1.���� ���� ���� �������� ���� 2.���� ���� ���� �������� ����\n ");
					
					Scanner englishScoreScanner = new Scanner(System.in);
					int englishScoreArray = englishScoreScanner.nextInt();
					
					switch (englishScoreArray) {
					case 1:
						System.out.println("===== ���� ���� �������� ��ȸ ��� =====\n");
						addEnglish.englishSearch();
						break;
						
					case 2:
						System.out.println("===== ���� ���� �������� ��ȸ ��� ===== \n");
						addEnglish.englishDescendingSearch();
						break;
						
					default:
						System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					
					break;
					
				case 3:
					System.out.println("1.���� ���� ���� �������� ���� 2.���� ���� ���� �������� ����\n ");
					
					Scanner scienceScoreScanner = new Scanner(System.in);
					int scienceScoreArray = scienceScoreScanner.nextInt();
					
					switch (scienceScoreArray) {
					case 1:
						System.out.println("===== ���� ���� �������� ��ȸ ��� =====\n");
						addScience.scienceSearch();
						break;
						
					case 2:
						System.out.println("===== ���� ���� �������� ��ȸ ��� ===== \n");
						addScience.scienceDescendingSearch();
						break;
						
					default:
						System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					break;
					
				case 4:
					System.out.println("1.���� ���� ���� �������� ���� 2.���� ���� ���� �������� ����\n ");
					
					Scanner koreanScoreScanner = new Scanner(System.in);
					int koreanScoreArray = koreanScoreScanner.nextInt();
					
					switch (koreanScoreArray) {
					case 1:
						System.out.println("===== ���� ���� �������� ��ȸ ��� =====\n");
						addKorean.koreanSearch();
						break;
						
					case 2:
						System.out.println("===== ���� ���� �������� ��ȸ ��� ===== \n");
						addKorean.koreanDescendingSearch();
						break;
						
					default:
						System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					break;
					
				case 5:
					System.out.println("===== �л� ���� ������ ��ȸ ��� =====\n");
					addStudentScore.display();
					break;

				default:
					System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					break;
				}
				
				break;

			case 2:
				System.out.println("******* �л� ��带 ���� �մϴ�. *******");
				System.out.println("1.���� �Է� 2. ���� ��ȸ");
				
				Scanner studentScanner = new Scanner(System.in);
				int studentMode = studentScanner.nextInt();
				
				switch (studentMode) {
				case 1:
					System.out.println("���� �Է��� ���� �ϰڽ��ϴ�.");
					System.out.println("�̸��� �Է��� �ּ���.");
					
					Scanner nameScanner = new Scanner(System.in);
					nameScan = nameScanner.nextLine();
					
					System.out.println("�й��� �Է��� �ּ���.");
					
					Scanner numberScanner = new Scanner(System.in);
					numberScan = numberScanner.nextInt();
					if (addStudentScore.getTreeMapStorage().getStudentTreeMap().containsKey(numberScan)) {
						System.out.println("�̹� ��ϵ� �й� �Դϴ�.");
						System.out.println("���α׷��� ����� �ϰڽ��ϴ�.");
						break;
					}
					
					System.out.println("�г��� �Է��� �ּ���.(1 ~ 4���� �Է� ����)");
					
					Scanner gradeScanner = new Scanner(System.in);
					int tempGradeScanner = gradeScanner.nextInt();
					
					if (tempGradeScanner >0 && tempGradeScanner < 5 ) {
						gradeScan = tempGradeScanner;
					}else {
						System.out.println("�г��� �߸� �Է� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					
					
					System.out.println("���� ������ �Է� �ϼ���.(0 ~ 100�� ���̷� �Է��ϼ���.)");
					
					Scanner mathScanner = new  Scanner(System.in);
					int tempMathScanner = mathScanner.nextInt();
					
					if (tempMathScanner >= 0 && tempMathScanner <= 100) {
						mathScan = tempMathScanner;
					}else {
						System.out.println("���� ������ �߸� �Է� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					
					System.out.println("���� ������ �Է� �ϼ���.(0 ~ 100�� ���̷� �Է��ϼ���.)");
					
					Scanner englishScanner = new Scanner(System.in);
					int tempEglishScanner = englishScanner.nextInt();
					
					if (tempEglishScanner >= 0 && tempEglishScanner <= 100) {
						englishScan = tempEglishScanner;
					}else {
						System.out.println("���� ������ �߸� �Է� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					
					System.out.println("���� ������ �Է� �ϼ���.(0 ~ 100�� ���̷� �Է��ϼ���.)");
					
					Scanner scienceScanner = new Scanner(System.in);
					int tempScienceScanner = scienceScanner.nextInt();
					
					if (tempScienceScanner >= 0 && tempScienceScanner <= 100) {
						scienceScan = tempScienceScanner;
					}else {
						System.out.println("���� ������ �߸� �Է� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					
					System.out.println("���� ������ �Է� �ϼ���.(0 ~ 100�� ���̷� �Է��ϼ���.)");
					
					Scanner koreanScanner = new Scanner(System.in);
					int tempKoreanScanner = koreanScanner.nextInt();
					
					if (tempKoreanScanner >= 0 && tempKoreanScanner <= 100) {
						koreanScan = tempKoreanScanner;
					}else {
						System.out.println("���� ������ �߸� �Է� �ϼ̽��ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
					
					addMath.addMathScore(mathScan, new Math.MathBuilder().studentNumber(numberScan).mathScore(mathScan).name(nameScan).grade(gradeScan).builder());
					addEnglish.addEnglishScore(englishScan, new English.EnglishBuilder().studentNumber(numberScan).englishScore(englishScan).name(nameScan).grade(gradeScan).builder());
					addScience.addScienceScore(scienceScan, new Science.ScienceBuilder().studentNumber(numberScan).scienceScore(scienceScan).name(nameScan).grade(gradeScan).builder());
					addKorean.addKoreanScore(koreanScan, new Korean.KoreanBuilder().studentNumber(numberScan).koreanScore(koreanScan).name(nameScan).grade(gradeScan).builder());
					addStudentScore.execute(numberScan, new Student.StudentBuilder().name(nameScan).studentNumber(numberScan).grade(gradeScan).mathScore(mathScan).englishScore(englishScan).scienceScore(scienceScan).koreanScore(koreanScan).builder());
					//addStudentScore.display();
					
					break;
				case 2:
					System.out.println("���� ��ȸ�� ���� �ϰڽ��ϴ�.");
					System.out.println("�й��� �Է� ���ּ���.");
					
					Scanner searchNumberScanner = new Scanner(System.in);
					int searchNumberScan = searchNumberScanner.nextInt();
					
					//searchStudent.searchStudent(searchNumberScan);
					if (addStudentScore.getTreeMapStorage().studentTreeMap.containsKey(searchNumberScan)) {
						System.out.println("===== ���� ��ȸ ��� =====");
						addStudentScore.search(searchNumberScan);
						System.out.println();
						break;
					}else {
						System.out.println();
						System.out.println("��ġ�ϴ� �й��� �����ϴ�.");
						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
						break;
					}
//					if (searchStudent.getTreeMapStorage().studentTreeMap.containsKey(searchNumberScan)) {
//						System.out.println(searchStudent.search(searchNumberScan));
//					}else {
//						System.out.println("��ġ�ϴ� �й��� �����ϴ�.");
//						System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
//						break;
//					}
					

				default:
					System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�.");
					System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
					break;
				}
				
				break;
				
			default:
				System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�.");
				System.out.println("���� �׷��� ����� �ϰڽ��ϴ�.\n");
				break;
			}
			//System.out.println("[ " + nameScan + " ]" + mathScan + ", " + englishScan + ", " + scienceScan + ", " + koreanScan);
		}
	}
}
