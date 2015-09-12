package basic.pattern.builder.part4;

public class BuilderPart4TestMain {

	public static void main(String[] args) {
		Cook cook = new Cook();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
 
		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();
 
		Pizza pizza = cook.getPizza();
		System.out.println(pizza);
		
		cook.setPizzaBuilder(spicyPizzaBuilder);
		cook.constructPizza();
		
		Pizza otherPizza = cook.getPizza();
		System.out.println(otherPizza);
	}

}
