import factory.FourCheese;
import factory.ItalianPizzaFactoryImpl;
import factory.Pizza;

public class Main {


    public static void main(String[] args) {
        Pizza fourCheese = new ItalianPizzaFactoryImpl().createPizza("fourCheese");
    }
}
