package basic.ch02;

public class Cigar1 implements CigaMaker{
	private int tex;
	private int pricePerProduct;
	
	@Override
	public void cigaProduct() {
		pricePerProduct = CIGAPRICE + 200;
		System.out.println("����");
	}

	@Override
	public void leafDry() {
		System.out.println("������");
	}

	@Override
	public void leafSelected() {
		System.out.println("����");
	}

}
