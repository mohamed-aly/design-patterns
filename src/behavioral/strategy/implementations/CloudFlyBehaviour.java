package behavioral.strategy.implementations;

import behavioral.strategy.interfaces.IFly;

public class CloudFlyBehaviour implements IFly {
    @Override
    public void fly() {
        System.out.println("I fly only in high in clouds!");
    }
}
