package factory;

public class FourCheese implements Pizza{
    public void bake() {
        System.out.println("печем 4 сыра");
    }

    public void cut() {
        System.out.println("режем 4 сыра");
    }

    public void box() {
        System.out.println("пакуем 4 сыра");
    }

}
