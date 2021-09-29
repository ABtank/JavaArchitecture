package factory;

public class Peperoni implements Pizza {
    public void bake() {
        System.out.println("печем пперони");
    }

    public void cut() {
        System.out.println("режем пперони");
    }

    public void box() {
        System.out.println("пакуем пперони");
    }
}
