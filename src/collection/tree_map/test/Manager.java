package collection.tree_map.test;

import java.util.Scanner;

public class Manager{

	String nameScan = "";
	int numberScan, mathScan, englishScan, scienceScan, koreanScan, gradeScan;
	//int sum = mathScan + englishScan + scienceScan + koreanScan;
	//float everage = sum/4;
	
	AddStorage<Integer, Student> addStudentScore = new AddStorage<Integer, Student>();
	//Search<Integer, Student> searchStudent = new Search<Integer, Student>();//Search 클래스를 따로 만들어서 실행 하면 왜 데이터값이 안들어가는지??
	AddStorage<Integer, Math> addMath = new AddStorage<Integer, Math>();
	AddStorage<Integer, English> addEnglish = new AddStorage<Integer, English>();
	AddStorage<Integer, Science> addScience = new AddStorage<Integer, Science>();
	AddStorage<Integer, Korean> addKorean = new AddStorage<Integer, Korean>();
	
	public void start() {
		while (true) {
			System.out.println("점수 관리 프로그램을 시작 합니다.");
			System.out.println("******* 모드를 선택 하세요. *******");
			System.out.println("1.교수 모드 2.학생 모드");
			
			Scanner modeScanner = new Scanner(System.in);
			int mode = modeScanner.nextInt();
			
			switch (mode) {
			case 1:
				System.out.println("******* 교수 모드를 시작 합니다. *******\n");
				System.out.println("1.수학 점수 관리 2.영어 점수 관리 3.과학 점수 관리 4.국어 점수 관리 5.학생 전체 점수\n");
				
				Scanner scoreScanner = new Scanner(System.in);
				int teacherMode = scoreScanner.nextInt();
				
				switch (teacherMode) {
				case 1:
					System.out.println("1.수학 점수 오름 차순으로 정렬 2.수학 점수 내림 차순으로 정렬\n ");
					
					Scanner mathScoreScanner = new Scanner(System.in);
					int mathScoreArray = mathScoreScanner.nextInt();
					
					switch (mathScoreArray) {
					case 1:
						System.out.println("===== 수학 점수 오름차순 조회 결과 =====\n");
						addMath.mathSearch();
						break;
					
					case 2:
						System.out.println("===== 수학 점수 내림차순 조회 결과 ===== \n");
						addMath.mathDescendingSearch();
						break;
						
					default:
						System.out.println("메뉴를 잘못 선택 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					break;
					
				case 2:
					System.out.println("1.영어 점수 오름 차순으로 정렬 2.영어 점수 내림 차순으로 정렬\n ");
					
					Scanner englishScoreScanner = new Scanner(System.in);
					int englishScoreArray = englishScoreScanner.nextInt();
					
					switch (englishScoreArray) {
					case 1:
						System.out.println("===== 영어 점수 오름차순 조회 결과 =====\n");
						addEnglish.englishSearch();
						break;
						
					case 2:
						System.out.println("===== 영어 점수 내림차순 조회 결과 ===== \n");
						addEnglish.englishDescendingSearch();
						break;
						
					default:
						System.out.println("메뉴를 잘못 선택 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					
					break;
					
				case 3:
					System.out.println("1.과학 점수 오름 차순으로 정렬 2.과학 점수 내림 차순으로 정렬\n ");
					
					Scanner scienceScoreScanner = new Scanner(System.in);
					int scienceScoreArray = scienceScoreScanner.nextInt();
					
					switch (scienceScoreArray) {
					case 1:
						System.out.println("===== 과학 점수 오름차순 조회 결과 =====\n");
						addScience.scienceSearch();
						break;
						
					case 2:
						System.out.println("===== 과학 점수 내림차순 조회 결과 ===== \n");
						addScience.scienceDescendingSearch();
						break;
						
					default:
						System.out.println("메뉴를 잘못 선택 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					break;
					
				case 4:
					System.out.println("1.국어 점수 오름 차순으로 정렬 2.국어 점수 내림 차순으로 정렬\n ");
					
					Scanner koreanScoreScanner = new Scanner(System.in);
					int koreanScoreArray = koreanScoreScanner.nextInt();
					
					switch (koreanScoreArray) {
					case 1:
						System.out.println("===== 국어 점수 오름차순 조회 결과 =====\n");
						addKorean.koreanSearch();
						break;
						
					case 2:
						System.out.println("===== 국어 점수 내림차순 조회 결과 ===== \n");
						addKorean.koreanDescendingSearch();
						break;
						
					default:
						System.out.println("메뉴를 잘못 선택 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					break;
					
				case 5:
					System.out.println("===== 학생 점수 정보를 조회 결과 =====\n");
					addStudentScore.display();
					break;

				default:
					System.out.println("메뉴를 잘못 선택 하셨습니다. 다시 입력해주세요.");
					break;
				}
				
				break;

			case 2:
				System.out.println("******* 학생 모드를 시작 합니다. *******");
				System.out.println("1.점수 입력 2. 점수 조회");
				
				Scanner studentScanner = new Scanner(System.in);
				int studentMode = studentScanner.nextInt();
				
				switch (studentMode) {
				case 1:
					System.out.println("점수 입력을 시작 하겠습니다.");
					System.out.println("이름을 입력해 주세요.");
					
					Scanner nameScanner = new Scanner(System.in);
					nameScan = nameScanner.nextLine();
					
					System.out.println("학번을 입력해 주세요.");
					
					Scanner numberScanner = new Scanner(System.in);
					numberScan = numberScanner.nextInt();
					if (addStudentScore.getTreeMapStorage().getStudentTreeMap().containsKey(numberScan)) {
						System.out.println("이미 등록된 학번 입니다.");
						System.out.println("프로그램을 재시작 하겠습니다.");
						break;
					}
					
					System.out.println("학년을 입력해 주세요.(1 ~ 4까지 입력 가능)");
					
					Scanner gradeScanner = new Scanner(System.in);
					int tempGradeScanner = gradeScanner.nextInt();
					
					if (tempGradeScanner >0 && tempGradeScanner < 5 ) {
						gradeScan = tempGradeScanner;
					}else {
						System.out.println("학년을 잘못 입력 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					
					
					System.out.println("수학 점수를 입력 하세요.(0 ~ 100점 사이로 입력하세요.)");
					
					Scanner mathScanner = new  Scanner(System.in);
					int tempMathScanner = mathScanner.nextInt();
					
					if (tempMathScanner >= 0 && tempMathScanner <= 100) {
						mathScan = tempMathScanner;
					}else {
						System.out.println("수학 점수를 잘못 입력 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					
					System.out.println("영어 점수를 입력 하세요.(0 ~ 100점 사이로 입력하세요.)");
					
					Scanner englishScanner = new Scanner(System.in);
					int tempEglishScanner = englishScanner.nextInt();
					
					if (tempEglishScanner >= 0 && tempEglishScanner <= 100) {
						englishScan = tempEglishScanner;
					}else {
						System.out.println("영어 점수를 잘못 입력 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					
					System.out.println("과학 점수를 입력 하세요.(0 ~ 100점 사이로 입력하세요.)");
					
					Scanner scienceScanner = new Scanner(System.in);
					int tempScienceScanner = scienceScanner.nextInt();
					
					if (tempScienceScanner >= 0 && tempScienceScanner <= 100) {
						scienceScan = tempScienceScanner;
					}else {
						System.out.println("과학 점수를 잘못 입력 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
					
					System.out.println("국어 점수를 입력 하세요.(0 ~ 100점 사이로 입력하세요.)");
					
					Scanner koreanScanner = new Scanner(System.in);
					int tempKoreanScanner = koreanScanner.nextInt();
					
					if (tempKoreanScanner >= 0 && tempKoreanScanner <= 100) {
						koreanScan = tempKoreanScanner;
					}else {
						System.out.println("국어 점수를 잘못 입력 하셨습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
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
					System.out.println("점수 조회를 시작 하겠습니다.");
					System.out.println("학번을 입력 해주세요.");
					
					Scanner searchNumberScanner = new Scanner(System.in);
					int searchNumberScan = searchNumberScanner.nextInt();
					
					//searchStudent.searchStudent(searchNumberScan);
					if (addStudentScore.getTreeMapStorage().studentTreeMap.containsKey(searchNumberScan)) {
						System.out.println("===== 성적 조회 결과 =====");
						addStudentScore.search(searchNumberScan);
						System.out.println();
						break;
					}else {
						System.out.println();
						System.out.println("일치하는 학번이 없습니다.");
						System.out.println("프로 그램을 재시작 하겠습니다.\n");
						break;
					}
//					if (searchStudent.getTreeMapStorage().studentTreeMap.containsKey(searchNumberScan)) {
//						System.out.println(searchStudent.search(searchNumberScan));
//					}else {
//						System.out.println("일치하는 학번이 없습니다.");
//						System.out.println("프로 그램을 재시작 하겠습니다.\n");
//						break;
//					}
					

				default:
					System.out.println("메뉴를 잘못 선택 하셨습니다.");
					System.out.println("프로 그램을 재시작 하겠습니다.\n");
					break;
				}
				
				break;
				
			default:
				System.out.println("메뉴를 잘못 선택 하셨습니다.");
				System.out.println("프로 그램을 재시작 하겠습니다.\n");
				break;
			}
			//System.out.println("[ " + nameScan + " ]" + mathScan + ", " + englishScan + ", " + scienceScan + ", " + koreanScan);
		}
	}
}
