package singleton;

public class Singleton {
    private static volatile Singleton instance;
//    private static volatile Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
