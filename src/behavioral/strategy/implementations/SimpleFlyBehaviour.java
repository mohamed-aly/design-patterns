package behavioral.strategy.implementations;

import behavioral.strategy.interfaces.IFly;

public class SimpleFlyBehaviour implements IFly {
    @Override
    public void fly() {
        System.out.println("Simple Flying!");
    }
}
