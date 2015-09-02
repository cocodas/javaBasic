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
			System.out.println("점수 관리 프로그램을 시작 합니다.");
			System.out.println("******* 모드를 선택 하세요. *******");
			System.out.println("1.교수 모드 2.학생 모드");
			
			Scanner modeScanner = new Scanner(System.in);
			int a = modeScanner.nextInt();
			
			switch (a) {
			case 1:
				System.out.println("******* 교수 모드를 시작 합니다. *******");
				System.out.println("1. 수학 점수 관리 2.영어 점수 관리 3.과학 점수 관리 4.국어 점수 관리");
				
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
					System.out.println("메뉴를 잘못 선택 하셨습니다. 다시 입력해주세요.");
					break;
				}
				
				break;

			case 2:
				System.out.println("******* 학생 모드를 시작 합니다. *******");
				System.out.println("1.점수 입력 2. 점수 확인");
				
				Scanner studentScanner = new Scanner(System.in);
				int c = studentScanner.nextInt();
				
				switch (c) {
				case 1:
					System.out.println("점수 입력을 시작 하겠습니다.");
					System.out.println("이름을 입력해 주세요.");
					
					Scanner nameScanner = new Scanner(System.in);
					nameScan = nameScanner.nextLine();
					
					System.out.println("학번을 입력해 주세요.");
					
					Scanner numberScanner = new Scanner(System.in);
					numberScan = numberScanner.nextInt();
					
					System.out.println("학년을 입력해 주세요.");
					
					Scanner gradeScanner = new Scanner(System.in);
					gradeScan = gradeScanner.nextInt();
					
					System.out.println("수학 점수를 입력 하세요.");
					
					Scanner mathScanner = new  Scanner(System.in);
					mathScan = mathScanner.nextInt();
					
					System.out.println("영어 점수를 입력 하세요.");
					
					Scanner englishScanner = new Scanner(System.in);
					englishScan = englishScanner.nextInt();
					
					System.out.println("과학 점수를 입력 하세요.");
					
					Scanner scienceScanner = new Scanner(System.in);
					scienceScan = scienceScanner.nextInt();
					
					System.out.println("국어 점수를 입력 하세요.");
					
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
