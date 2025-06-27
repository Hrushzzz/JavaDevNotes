package DesignPatterns.Singleton;

public class SingletonAdv {

    public static SingletonAdv instance = null;

    private SingletonAdv() {
    }

    public static SingletonAdv getInstance() {
        if (instance == null) {  // This is called as "DOUBLE-CHECKED LOCKING"
            synchronized (SingletonAdv.class) {
                if (instance == null) {
                    instance = new SingletonAdv();
                }
            }
        }
        return instance;
    }
}
