package bridge.after;

public class FourLegsMoveImpl implements MoveImplementor {
    @Override
    public void move() {
        System.out.println("двигаюсь 4 лапами");
    }

    @Override
    public void sleep() {
        System.out.println("sleep...");
    }
}
