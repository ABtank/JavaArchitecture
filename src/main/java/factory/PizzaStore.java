package factory;

public abstract class PizzaStore {

    public void orderPizza(String name){
        Pizza pizza = createPizza(name);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(String name);
}
