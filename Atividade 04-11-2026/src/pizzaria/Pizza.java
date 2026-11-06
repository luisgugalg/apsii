package pizzaria;

import java.util.StringJoiner;

public abstract class Pizza {
    private String name;
    protected final PizzaIngredientFactory ingredientFactory;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Veggies[] veggies;
    protected Pepperoni pepperoni;
    protected Clam clam;

    protected Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    protected abstract void prepare();

    protected final void prepareBase() {
        System.out.println("Preparando " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    void bake() {
        System.out.println("Assar por 25 minutos a 350°");
    }

    void cut() {
        System.out.println("Cortar a pizza em fatias diagonais");
    }

    void box() {
        System.out.println("Colocar a pizza na caixa oficial da pizzaria");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (dough == null) {
            return String.valueOf(name);
        }

        StringJoiner ingredients = new StringJoiner(", ");
        ingredients.add(dough.toString()).add(sauce.toString()).add(cheese.toString());
        if (veggies != null) {
            for (Veggies vegetable : veggies) {
                ingredients.add(vegetable.toString());
            }
        }
        if (pepperoni != null) {
            ingredients.add(pepperoni.toString());
        }
        if (clam != null) {
            ingredients.add(clam.toString());
        }
        return name + System.lineSeparator() + "Ingredientes: " + ingredients;
    }
}
