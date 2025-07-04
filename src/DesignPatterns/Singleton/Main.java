package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        // All three objects will have the same address and point to one SINGLETON object.
        System.out.println(s1 == s2);
    }
}
