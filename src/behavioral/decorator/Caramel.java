package behavioral.decorator;

public class Caramel extends Decorator {

    public Caramel(double cost, Beverage beverage) {
        super(cost, beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + this.cost;
    }
}
