package behavioral.decorator;

public abstract class Beverage {
    protected double cost;

    public Beverage(double cost) {
        this.cost = cost;
    }

    public abstract double getCost();
}
