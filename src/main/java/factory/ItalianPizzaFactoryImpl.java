package factory;

public class ItalianPizzaFactoryImpl implements PizzaFactory {
    @Override
    public Pizza createPizza(String name) {
        if(name.equals("fourCheese")){
            System.out.println("ItalianPizzaFactoryImpl createPizza FourCheese");
            return new FourCheese();
        }else if(name.equals("peperoni")){
            return new Peperoni();
        }
        return null;
    }

    abstract class Pizzeria {
        private PizzaFactory pizzaFactory;

        public Pizzeria(PizzaFactory pizzaFactory){
            this.pizzaFactory = pizzaFactory;
        }

        public String getPhone(){
            return "8080800880";
        }

        public Pizza createPizza(String name) {
            return pizzaFactory.createPizza(name);
        }
    }
}
