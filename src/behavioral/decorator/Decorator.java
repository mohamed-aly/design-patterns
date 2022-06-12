package behavioral.decorator;

public abstract class Decorator extends Beverage {

    protected Beverage beverage;

    public Decorator(double cost, Beverage beverage) {
        super(cost);
        this.beverage = beverage;
    }

    public abstract double getCost();
}
