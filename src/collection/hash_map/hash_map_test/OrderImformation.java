package collection.hash_map.hash_map_test;

public class OrderImformation {
	AddStorage<String,Fruit> addFruit = new AddStorage<String,Fruit>();
	AddStorage<String, Vegetable> addVegetable = new AddStorage<>();
	AddStorage<Integer, Snack> addSnack = new AddStorage<>();
	
	RemoveStorage<String, Fruit> removeFruit = new RemoveStorage<>();
	RemoveStorage<String, Vegetable> removeVegetable = new RemoveStorage<>();
	RemoveStorage<Integer, Snack> removeSnack = new RemoveStorage<>();
	
	public void fruitImformation() {
		System.out.println("***** 선택한 과일 정보 *****");
		addFruit.fruitExecute("첫번째",new Fruit.FruitBuilder().fruitName("사과").count(12).weight(120.5).price(1500).home("대구").producerNumber(92847476).builder());
		addFruit.fruitExecute("두번째",new Fruit.FruitBuilder().fruitName("배").count(15).weight(100.25).price(2000).home("영월").producerNumber(92841234).builder());
		addFruit.fruitExecute("세번째",new Fruit.FruitBuilder().fruitName("감").count(25).weight(250.12).price(800).home("전주").producerNumber(95673489).builder());
		
		addFruit.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	public void vegetableImformation() {
		System.out.println("***** 선택한 채소 정보 *****");
		
		addVegetable.vegetableExecute("첫번째", new Vegetable.VegetableBuilder().vegetableName("토마토").count(5).grade("상").weight(2.5).price(2500).home("마산").producerNumber("010-9284-7476").builder());
		addVegetable.vegetableExecute("두번째", new Vegetable.VegetableBuilder().vegetableName("오이").count(10).grade("특상").weight(1.5).price(2000).home("강릉").producerNumber("010-9256-5678").builder());
		addVegetable.vegetableExecute("세번째", new Vegetable.VegetableBuilder().vegetableName("양파").count(15).grade("중").weight(4.5).price(7500).home("광주").producerNumber("010-9222-1234").builder());
		
		addVegetable.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	public void snackImformation() {
		System.out.println("***** 선택한 과자 정보 *****");
		
		addSnack.snackExecute(1, new Snack.SnackBuilder().snackName("칸쵸").count(5).weight(125).expirationDate("2016-04-15").manufactureCompany("오리온").price(2500).builder());
		addSnack.snackExecute(2, new Snack.SnackBuilder().snackName("초코파이").count(10).weight(50).expirationDate("2016-07-07").manufactureCompany("해태").price(3300).builder());
		addSnack.snackExecute(3, new Snack.SnackBuilder().snackName("빅파이").count(15).weight(35).expirationDate("2017-01-22").manufactureCompany("크라운").price(3000).builder());
		
		addSnack.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	
	public void fruitCancle() {
		System.out.println("배를 주문을 취소 하겠습니다.");
		removeFruit.setHashMapStorage(addFruit.getHashMapStorage());
		removeFruit.fruitRemove("두번째");
		
		removeFruit.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		//System.out.println("과일 사이즈 : " + removeFruit.fruitSize());
	}
	
	public void vegetableCancle() {
		System.out.println("양파를 주문 취소 하겠습니다.");
		removeVegetable.setHashMapStorage(addVegetable.getHashMapStorage());
		removeVegetable.vegetableRemove("세번째");

		removeVegetable.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void snackCancle() {
		System.out.println("칸쵸 과자를 취소 하겠습니다.");
		removeSnack.setHashMapStorage(addSnack.getHashMapStorage());
		removeSnack.snackRemove(1);
		
		removeSnack.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
	}
	
}
