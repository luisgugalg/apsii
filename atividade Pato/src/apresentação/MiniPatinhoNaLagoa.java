package apresentação;

import patos.Duck;
import patos.MallardDuck;

public class MiniPatinhoNaLagoa {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.display();

        mallard.performQuack();

        mallard.performFly();

        mallard.swim();
    }
}