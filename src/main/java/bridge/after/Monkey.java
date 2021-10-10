package bridge.after;


public class Monkey extends AbstractAnimal {
    public Monkey(MoveImplementor implementor) {
        super(implementor);
    }

    @Override
    public void move() {
        implementor.move();
    }

    @Override
    public void live() {
        implementor.move();
        implementor.sleep();
    }
}
