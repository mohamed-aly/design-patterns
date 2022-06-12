package behavioral.decorator;

public class Soy extends Decorator {

    public Soy(double cost, Beverage beverage) {
        super(cost, beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + this.cost;
    }
}
