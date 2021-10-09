package decorator;

public class Coffee implements Beverage {
    @Override
    public double getPrice() {
        return 100;
    }
}
