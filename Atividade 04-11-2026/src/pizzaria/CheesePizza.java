package pizzaria;

public class CheesePizza extends Pizza {
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    protected void prepare() {
        prepareBase();
    }
}
