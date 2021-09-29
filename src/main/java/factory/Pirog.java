package factory;

public class Pirog implements Pizza {
    @Override
    public void bake() {
        System.out.println("печем пирог");
    }

    @Override
    public void cut() {
        System.out.println("режем пирог");
    }

    @Override
    public void box() {
        System.out.println("пакуем пирог");
    }
}
