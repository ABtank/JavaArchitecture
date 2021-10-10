package bridge.after;

public class Lemur extends AbstractAnimal {

    public Lemur(MoveImplementor implementor) {
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
