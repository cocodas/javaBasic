package basic.pattern.builder.part4;

/**
 * ConcreteBuilder
 * @author wiki dic
 * ���ڸ� �ſ�� ���� ����� concrete class
 * ���ڸ� ��üȭ ������ Ư���ִ� ���ڸ� ����� �ȴ�.
 * 
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("pan baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pepperoni + salami");
	}

}
