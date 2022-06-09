package behavioral.strategy.implementations;

import behavioral.strategy.interfaces.IQuack;

public class LoudQuackImpl implements IQuack {

    @Override
    public void quack() {
        System.out.println("loud quacking!");
    }
}
