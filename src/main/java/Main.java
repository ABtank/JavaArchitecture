import builder.OrderInfoDto;
import factory.*;

public class Main {


    public static void main(String[] args) {
        Pizza fourCheese = new ItalianPizzaFactoryImpl().createPizza("fourCheese");
        PizzaStore russiaPizzaStore = new RussiaPizzaStoreImpl();
        russiaPizzaStore.orderPizza("пирог");

        //Builder
        OrderInfoDto orderInfoDto = OrderInfoDto
                .builder("info Vasiliy")
                .withOrderDescr("descr")
                .build();
    }
}
