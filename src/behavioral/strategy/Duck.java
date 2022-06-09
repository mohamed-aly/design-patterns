package behavioral.strategy;
/*
Strategy pattern concludes that inheritence is not the right choice always.
and composition is preferable in some cases.
 */

import behavioral.strategy.interfaces.IDisplay;
import behavioral.strategy.interfaces.IFly;
import behavioral.strategy.interfaces.IQuack;

public class Duck {
    private IFly flyBehaviour;
    private IQuack quackBehaviour;
    private IDisplay displayBehaviour;

    public Duck(IFly flyBehaviour, IQuack quackBehaviour, IDisplay displayBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.displayBehaviour = displayBehaviour;
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void quack(){
        quackBehaviour.quack();
    }

    public void display(){
        displayBehaviour.Display();
    }
}
