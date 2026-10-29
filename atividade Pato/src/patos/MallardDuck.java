package patos;

import voos.FlyWithWings;
import quacks.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Sou um pato Mallard!");
    }
}