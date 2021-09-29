package factory;

public class Peperoni implements Pizza {
    public void bake() {
        System.out.println("печем пеперони");
    }

    public void cut() {
        System.out.println("режем пеперони");
    }

    public void box() {
        System.out.println("пакуем пеперони");
    }
}
