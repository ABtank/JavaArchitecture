package decorator;

public abstract class IngridientDecorator implements Beverage {
    protected Beverage beverage;

    public IngridientDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

}
