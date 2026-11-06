package pizzaria;

public class ClamPizza extends Pizza {
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    protected void prepare() {
        prepareBase();
        clam = ingredientFactory.createClam();
    }
}
