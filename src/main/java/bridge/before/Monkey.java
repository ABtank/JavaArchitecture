package bridge.before;

import bridge.Animal;

public class Monkey implements Animal {
    @Override
    public void move() {
        System.out.println("хожу на четырех ногах");
    }
}