import builder.OrderInfoDto;
import factory.*;
import singleton.Singleton;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza fourCheese = new ItalianPizzaFactoryImpl().createPizza("fourCheese");
        PizzaStore russiaPizzaStore = new RussiaPizzaStoreImpl();
        russiaPizzaStore.orderPizza("пирог");

        //Builder
        OrderInfoDto orderInfoDto = OrderInfoDto
                .builder("info Vasiliy")
                .withOrderDescr("descr")
                .build();

//        Singleton
        Singleton s = Singleton.getInstance();

//        Prototype
        OrderInfoDto clone = (OrderInfoDto) orderInfoDto.clone();
        orderInfoDto.setClientInfo("info client");
        System.out.println(clone);
        System.out.println(orderInfoDto);
    }
}
