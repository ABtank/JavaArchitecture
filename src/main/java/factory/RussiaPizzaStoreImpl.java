package factory;

public class RussiaPizzaStoreImpl extends PizzaStore {
    @Override
    Pizza createPizza(String name) {
        if (name.equals("пирог")){
            return new Pirog();
        }else{
            throw new UnsupportedOperationException("могу делать только пирог");
        }
    }
}
