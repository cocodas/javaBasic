package basic.pattern.builder.part4;
/**
 * Abstract Builder
 * @author wiki dic
 * 피자를 만듬에 있어서 기본 적인 피자 요소를 가져와서 가계의 레시피로
 * 그 가계만의 도우, 소스, 토핑을 한다.
 * 이 추상 PizzaBuilder 클래스는 가계만의 레시피를 만들기 위한 클래스로 
 * 보면 된다.
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
