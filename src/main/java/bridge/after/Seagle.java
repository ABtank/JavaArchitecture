package bridge.after;

public class Seagle extends AbstractAnimal{

    public Seagle(MoveImplementor implementor) {
        super(implementor);
    }

    @Override
    public void move() {
        implementor.move();
    }

    @Override
    public void live() {
        implementor.move();
    }
}
