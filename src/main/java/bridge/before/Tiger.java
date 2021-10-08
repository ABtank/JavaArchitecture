package bridge.before;

import bridge.Animal;

public class Tiger implements Animal {
    @Override
    public void move() {
        System.out.println("хожу на четырех ногах");
    }
}