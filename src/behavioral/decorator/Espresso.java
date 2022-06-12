package behavioral.decorator;

public class Espresso extends Beverage {

    public Espresso(double cost) {
        super(cost);
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
