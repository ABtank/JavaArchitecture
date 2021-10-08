package adapter;

public class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("Monkey move");
    }

    public void speak(){
        System.out.println("Monkey speak bu bu bu "+name);
    }
}
