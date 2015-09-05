package basic.pattern.builder.part4;
/**
 * Abstract Builder
 * @author wiki dic
 * ���ڸ� ���뿡 �־ �⺻ ���� ���� ��Ҹ� �����ͼ� ������ �����Ƿ�
 * �� ���踸�� ����, �ҽ�, ������ �Ѵ�.
 * �� �߻� PizzaBuilder Ŭ������ ���踸�� �����Ǹ� ����� ���� Ŭ������ 
 * ���� �ȴ�.
 *
 */
public abstract class PizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();
}
