package pizzaria;

public class VeggiePizza extends Pizza {
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    protected void prepare() {
        prepareBase();
        veggies = ingredientFactory.createVeggies();
    }
}
