package pizzaria;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore newYork = new NYStylePizzaStore();
        PizzaStore chicago = new ChicagoStylePizzaStore();
        String[] types = {"queijo", "vegetariana", "mariscos", "calabresa"};

        for (String type : types) {
            System.out.println(newYork.orderPizza(type));
            System.out.println();
            System.out.println(chicago.orderPizza(type));
            System.out.println();
        }
    }
}
