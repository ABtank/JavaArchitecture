package adapter;

public class Women implements Human {

    private String name;

    public Women(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Women move");
    }

    @Override
    public void speak() {
        System.out.println("Women speak");
    }

    @Override
    public void work() {
        System.out.println("Women work");
    }
}
