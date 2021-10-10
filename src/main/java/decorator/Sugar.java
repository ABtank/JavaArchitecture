package decorator;

public class Sugar extends IngridientDecorator{

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return 10 + beverage.getPrice();
    }
}
