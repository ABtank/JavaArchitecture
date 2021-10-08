package bridge.after;

public class TwoLegsMoveImpl implements MoveImplementor {
    @Override
    public void move() {
        System.out.println("хожу 2 ногами");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
