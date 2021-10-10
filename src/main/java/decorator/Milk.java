package decorator;

public class Milk extends IngridientDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return 20 + beverage.getPrice();
    }
}
