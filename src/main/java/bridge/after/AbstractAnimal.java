package bridge.after;


import bridge.Animal;

public abstract class AbstractAnimal implements Animal {

    protected MoveImplementor implementor;

    public AbstractAnimal(MoveImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void move();

    public abstract void live();
}
