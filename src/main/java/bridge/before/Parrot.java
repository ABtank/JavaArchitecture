package bridge.before;

import bridge.Animal;

public class Parrot implements Animal {

    @Override
    public void move() {
        System.out.println("поднимаю крылья");
        System.out.println("опускаю крылья");
    }
}