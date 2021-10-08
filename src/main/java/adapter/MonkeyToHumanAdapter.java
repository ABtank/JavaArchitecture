package adapter;

public class MonkeyToHumanAdapter extends Monkey implements Human{

    public MonkeyToHumanAdapter(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("придется идти на работу");
        move();
    }
}
