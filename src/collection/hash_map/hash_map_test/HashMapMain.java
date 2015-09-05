package collection.hash_map.hash_map_test;

public class HashMapMain {

	public static void main(String[] args) {
		
		OrderImformation imformation = new OrderImformation();
		
		//주문할 품목 추가
		imformation.fruitImformation();
		imformation.vegetableImformation();
		imformation.snackImformation();
		
		//주문한 품목 취소 후 결과
		imformation.fruitCancle();
		imformation.vegetableCancle();
		imformation.snackCancle();

	}

}
