package basic.pattern.builder.part4;

/**
 * Director
 * @author wiki dic
 * 피자와 레시피가 준비되었다면 본격적으로 피자를 구워야 한다.
 * 비유하자면 음식점에서 요리사라고 보면 된다.
 * 빌더 패턴에서 중요한 역활을 갖고 있으며 결과물을 완성하는데 기여하며 
 * 보통 빌더 패턴에서 디렉터로 불린다.
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
