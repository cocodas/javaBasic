package basic.pattern.builder.part4;

/**
 * ConcreteBuilder
 * @author wiki dic
 * 피자를 하와이식으로 만드는 concrete class
 * 피자를 구체화 함으로 특성있는 피자를 만들게 된다.
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
