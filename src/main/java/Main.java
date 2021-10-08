import adapter.*;
import builder.OrderInfoDto;
import factory.ItalianPizzaFactoryImpl;
import factory.Pizza;
import factory.PizzaStore;
import factory.RussiaPizzaStoreImpl;
import singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

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

//        Adapter
        List<Human> humanList = new ArrayList<>();
//        #1
        MonkeyToHumanAdapter monkeyToHumanAdapter = new MonkeyToHumanAdapter("Обезяна");
        Monkey monkey = monkeyToHumanAdapter;
//        #2
        MonkeyToHumanAnotherAdapter monkeyToHumanAnotherAdapter = new MonkeyToHumanAnotherAdapter(new Monkey("бибизяна 2"));

        humanList.add(new Women("woman"));
        humanList.add(new Man("man"));
        humanList.add(monkeyToHumanAdapter);        //  #1
        humanList.add(monkeyToHumanAnotherAdapter); //  #2
        humanList.forEach(Human::speak);
        humanList.forEach(Human::work);
    }
}
