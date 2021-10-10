import adapter.Monkey;
import adapter.*;
import bridge.after.*;
import builder.OrderInfoDto;
import composite.Developer;
import composite.EmployeeComponent;
import composite.Manager;
import composite.fitness.Round;
import composite.fitness.Workout;
import composite.fitness.WorkoutComponent;
import composite.fitness.WorkoutExercise;
import decorator.*;
import factory.ItalianPizzaFactoryImpl;
import factory.Pizza;
import factory.PizzaStore;
import factory.RussiaPizzaStoreImpl;
import proxy.CurrencyRateService;
import proxy.Money;
import proxy.ProxyCurrencyRateService;
import singleton.Singleton;

import java.util.*;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza fourCheese = new ItalianPizzaFactoryImpl().createPizza("fourCheese");
        PizzaStore russiaPizzaStore = new RussiaPizzaStoreImpl();
        russiaPizzaStore.orderPizza("пирог");

//        -=BUILDER=-
        OrderInfoDto orderInfoDto = OrderInfoDto
                .builder("info Vasiliy")
                .withOrderDescr("descr")
                .build();

//        -=SINGLETON=-
        Singleton s = Singleton.getInstance();

//        -=PROTOTYPE=-
        OrderInfoDto clone = (OrderInfoDto) orderInfoDto.clone();
        orderInfoDto.setClientInfo("info client");
        System.out.println(clone);
        System.out.println(orderInfoDto);

//        -=ADAPTER=-
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

//        -=BRIDGE=-
        System.out.println("-=Bridge=-");
        MoveImplementor twolegs = new TwoLegsMoveImpl();
        MoveImplementor fourlegs = new FourLegsMoveImpl();
        MoveImplementor birdMove = new BirdMoveImpl();

        AbstractAnimal monkey2 = new bridge.after.Monkey(fourlegs);
        AbstractAnimal tiger = new Tiger(fourlegs);
        AbstractAnimal parrot = new Parrot(birdMove);
        AbstractAnimal seagle = new Seagle(birdMove);

        List<AbstractAnimal> animals = List.of(monkey2, tiger, parrot, seagle);
        animals.forEach(AbstractAnimal::live);

//        -=COMPOSITE=-
        List<EmployeeComponent> composite = new LinkedList<>();
        EmployeeComponent ceo = new Manager(
                "Владимир Владимирович Путин",
                "Глава"
        );
        EmployeeComponent subManager = new Manager(
                "Мишустин Михаил Владимирович",
                "ФСБ"
        );
        EmployeeComponent subManager2 = new Manager(
                "Герман Греф",
                "Финансы"
        );
        ceo.addChild(subManager);
        ceo.addChild(subManager2);
        EmployeeComponent developer1 = new Developer(
                "Нестеренко Дмитрий Олегович",
                "Senior Java Developer"
        );
        EmployeeComponent developer2 = new Developer(
                "Ивано Иван Иванович",
                "Тестеровщик"
        );
        subManager.addChild(developer1);
        subManager.addChild(developer2);

        EmployeeComponent financialDeveloper = new Developer(
                "Иванов Сергей",
                "Senior Java Developer"
        );
        EmployeeComponent financialTester = new Developer(
                "Иванов Алексей",
                "Тестеровщик"
        );
        subManager2.addChild(financialDeveloper);
        subManager2.addChild(financialTester);
//        ceo.print();

        ceo.sleep();

//        V.2 for fitnessAB
        WorkoutComponent workout = new Workout("first workout");
        List<WorkoutComponent> listEx = new ArrayList<>();
        listEx.add(new WorkoutExercise("Подтягивания"));
        listEx.add(new WorkoutExercise("Отжимания"));
        listEx.add(new WorkoutExercise("Приседания"));
        listEx.forEach(exercise -> workout.addChild(exercise));

        List<WorkoutComponent> listRounds = new ArrayList<>();
        listRounds.add(new Round("70", 7));
        listRounds.add(new Round("70", 7));
        listRounds.add(new Round("70", 7));
        listRounds.add(new Round("70", 7));
        listRounds.add(new Round("70", 7));
        listRounds.add(new Round("55", 12));
        listRounds.add(new Round("55", 12));
        listRounds.add(new Round("55", 12));
        listRounds.add(new Round("55", 12));
        listRounds.add(new Round("55", 12));
        listRounds.add(new Round("78", 15));
        listRounds.add(new Round("78", 15));
        listRounds.add(new Round("78", 15));
        listRounds.add(new Round("78", 15));
        listRounds.add(new Round("78", 15));

        for (int i = 0; i < listEx.size(); i++) {
            for (int j = i * 5; j < (5 + i * 5); j++) {
                listEx.get(i).addChild(listRounds.get(j));
            }
        }

        System.out.println("-=Workout=-");
        System.out.println(workout.toString());
        System.out.println("Тоннаж за тренировку = " + workout.getSumWeigth());
        System.out.println("Всего упражнений = " + workout.geSumChild());
        int allRounds = 0;
        int allRips = 0;
        for (int i = 0; i < workout.getChild().size(); i++) {
            allRounds += workout.getChild().get(i).geSumChild();
            allRips += workout.getChild().get(i).getSumRep();
        }
        System.out.println("Всего подходов = " + allRounds);
        System.out.println("Всего повторов = " + allRips);
        System.out.println("Упражнения ");
        for (int i = 0; i < workout.getChild().size(); i++) {
            System.out.println(" #" + workout.getChild().get(i).getOrdinal() + " " + workout.getChild().get(i).getName());
            System.out.println("Тоннаж: " + workout.getChild().get(i).getSumWeigth());
            System.out.println("Всего подходов: " + workout.getChild().size());
            System.out.println("Всего повторов: " + workout.getChild().get(i).getSumRep());
            System.out.println("1ПМ = " + workout.getChild().get(i).getOneRepMax());
        }


//        -=DECORATOR=-
        Beverage beverage = new Sugar(new Milk(new Coffee()));
        System.out.println("coffee price = " + beverage.getPrice());

        Beverage tea = new Milk(new Tea());
        System.out.println("tea price = " + tea.getPrice());


        // создаем сервис
        CurrencyRateService currencyRateService = new ProxyCurrencyRateService();

        // получаем курс из кэша или от цб – это уже решает прокси
        Money rate = currencyRateService.getCurrencyRate(Currency.getInstance(Locale.US));
        System.out.println(Currency.getInstance(Locale.US));

    }
}
