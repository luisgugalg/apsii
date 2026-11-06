package pizzaria;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    protected void prepare() {
        prepareBase();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
