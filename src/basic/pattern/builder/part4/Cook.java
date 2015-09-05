package basic.pattern.builder.part4;

/**
 * Director
 * @author wiki dic
 * ���ڿ� �����ǰ� �غ�Ǿ��ٸ� ���������� ���ڸ� ������ �Ѵ�.
 * �������ڸ� ���������� �丮���� ���� �ȴ�.
 * ���� ���Ͽ��� �߿��� ��Ȱ�� ���� ������ ������� �ϼ��ϴµ� �⿩�ϸ� 
 * ���� ���� ���Ͽ��� ���ͷ� �Ҹ���.
 */
public class Cook {
	private PizzaBuilder pizzaBuilder;
	 
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
 
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
 
	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}
