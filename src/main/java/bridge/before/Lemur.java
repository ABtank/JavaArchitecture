package bridge.before;

import bridge.Animal;

public class Lemur implements Animal {
    @Override
    public void move() {
        System.out.println("поднимаю левую ногу");
        System.out.println("поднимаю правую ногу");
        System.out.println("опускаю левую ногу");
        System.out.println("опускаю правую ногу");
    }
}