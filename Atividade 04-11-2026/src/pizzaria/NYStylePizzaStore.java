package pizzaria;

public class NYStylePizzaStore extends PizzaStore {
    private final PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if ("queijo".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de Queijo no Estilo de Nova York");
        } else if ("vegetariana".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Pizza Vegetariana no Estilo de Nova York");
        } else if ("mariscos".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de Mariscos no Estilo de Nova York");
        } else if ("calabresa".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Pizza de Calabresa no Estilo de Nova York");
        } else {
            throw new IllegalArgumentException("Tipo de pizza desconhecido: " + type);
        }
        return pizza;
    }
}
