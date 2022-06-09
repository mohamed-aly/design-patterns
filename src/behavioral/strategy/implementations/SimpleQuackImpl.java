package behavioral.strategy.implementations;

import behavioral.strategy.interfaces.IQuack;

public class SimpleQuackImpl implements IQuack {
    @Override
    public void quack() {
        System.out.println("Simple Quacking");
    }
}
