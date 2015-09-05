package basic.pattern.builder.part4;

/**
 * ConcreteBuilder
 * @author wiki dic
 * ���ڸ� �Ͽ��̽����� ����� concrete class
 * ���ڸ� ��üȭ ������ Ư���ִ� ���ڸ� ����� �ȴ�.
 * 
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");

	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham + pineapple");
	}

}
