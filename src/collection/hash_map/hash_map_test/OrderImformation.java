package collection.hash_map.hash_map_test;

public class OrderImformation {
	AddStorage<String,Fruit> addFruit = new AddStorage<String,Fruit>();
	AddStorage<String, Vegetable> addVegetable = new AddStorage<>();
	AddStorage<Integer, Snack> addSnack = new AddStorage<>();
	
	RemoveStorage<String, Fruit> removeFruit = new RemoveStorage<>();
	RemoveStorage<String, Vegetable> removeVegetable = new RemoveStorage<>();
	RemoveStorage<Integer, Snack> removeSnack = new RemoveStorage<>();
	
	public void fruitImformation() {
		System.out.println("***** ������ ���� ���� *****");
		addFruit.fruitExecute("ù��°",new Fruit.FruitBuilder().fruitName("���").count(12).weight(120.5).price(1500).home("�뱸").producerNumber(92847476).builder());
		addFruit.fruitExecute("�ι�°",new Fruit.FruitBuilder().fruitName("��").count(15).weight(100.25).price(2000).home("����").producerNumber(92841234).builder());
		addFruit.fruitExecute("����°",new Fruit.FruitBuilder().fruitName("��").count(25).weight(250.12).price(800).home("����").producerNumber(95673489).builder());
		
		addFruit.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	public void vegetableImformation() {
		System.out.println("***** ������ ä�� ���� *****");
		
		addVegetable.vegetableExecute("ù��°", new Vegetable.VegetableBuilder().vegetableName("�丶��").count(5).grade("��").weight(2.5).price(2500).home("����").producerNumber("010-9284-7476").builder());
		addVegetable.vegetableExecute("�ι�°", new Vegetable.VegetableBuilder().vegetableName("����").count(10).grade("Ư��").weight(1.5).price(2000).home("����").producerNumber("010-9256-5678").builder());
		addVegetable.vegetableExecute("����°", new Vegetable.VegetableBuilder().vegetableName("����").count(15).grade("��").weight(4.5).price(7500).home("����").producerNumber("010-9222-1234").builder());
		
		addVegetable.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	public void snackImformation() {
		System.out.println("***** ������ ���� ���� *****");
		
		addSnack.snackExecute(1, new Snack.SnackBuilder().snackName("ĭ��").count(5).weight(125).expirationDate("2016-04-15").manufactureCompany("������").price(2500).builder());
		addSnack.snackExecute(2, new Snack.SnackBuilder().snackName("��������").count(10).weight(50).expirationDate("2016-07-07").manufactureCompany("����").price(3300).builder());
		addSnack.snackExecute(3, new Snack.SnackBuilder().snackName("������").count(15).weight(35).expirationDate("2017-01-22").manufactureCompany("ũ���").price(3000).builder());
		
		addSnack.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	
	public void fruitCancle() {
		System.out.println("�踦 �ֹ��� ��� �ϰڽ��ϴ�.");
		removeFruit.setHashMapStorage(addFruit.getHashMapStorage());
		removeFruit.fruitRemove("�ι�°");
		
		removeFruit.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		//System.out.println("���� ������ : " + removeFruit.fruitSize());
	}
	
	public void vegetableCancle() {
		System.out.println("���ĸ� �ֹ� ��� �ϰڽ��ϴ�.");
		removeVegetable.setHashMapStorage(addVegetable.getHashMapStorage());
		removeVegetable.vegetableRemove("����°");

		removeVegetable.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void snackCancle() {
		System.out.println("ĭ�� ���ڸ� ��� �ϰڽ��ϴ�.");
		removeSnack.setHashMapStorage(addSnack.getHashMapStorage());
		removeSnack.snackRemove(1);
		
		removeSnack.display();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
	}
	
}
