package basic.pattern.builder.part4;

/**
 * ConcreteBuilder
 * @author wiki dic
 * 피자를 매운맛 피자 만드는 concrete class
 * 피자를 구체화 함으로 특성있는 피자를 만들게 된다.
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
