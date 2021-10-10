package bridge.after;


public class Parrot extends AbstractAnimal {

    public Parrot(MoveImplementor implementor) {
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
