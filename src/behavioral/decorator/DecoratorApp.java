package behavioral.decorator;

/*
1- change the behaviour of the object at runtime
without changing or rewriting the class
2- attach responsibility to the object dynamically (extend functionality)

 */
public class DecoratorApp {
    public static void main(String[] args) {
        Beverage espressoWithCaramelAndSoy = new Caramel(2, new Soy(1, new Espresso(3)));
        System.out.println("cost is " + espressoWithCaramelAndSoy.getCost());
    }


}
