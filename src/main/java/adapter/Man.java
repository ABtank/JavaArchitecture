package adapter;

public class Man implements Human {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("хожу");
    }

    @Override
    public void speak() {
        System.out.println("меня зовут " + name);
    }

    @Override
    public void work() {
        System.out.println("работаю программистом");
    }
}
