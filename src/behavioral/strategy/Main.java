package behavioral.strategy;

import behavioral.strategy.implementations.LoudQuackImpl;
import behavioral.strategy.implementations.SimpleFlyBehaviour;
import behavioral.strategy.implementations.SimpleQuackImpl;
import behavioral.strategy.implementations.TextDisplayImpl;
import behavioral.strategy.interfaces.IDisplay;
import behavioral.strategy.interfaces.IFly;
import behavioral.strategy.interfaces.IQuack;

public class Main {
    /*
    behaviour will change depending on the implementation passed to constructor
     */
    public static void main(String[] args) {
        IFly flyImpl = new SimpleFlyBehaviour();
        IQuack quackImpl = new LoudQuackImpl();
        IDisplay displayImpl = new TextDisplayImpl();

        Duck duck = new Duck(flyImpl, quackImpl, displayImpl);

        duck.fly();
        duck.quack();
        duck.display();

    }
}
