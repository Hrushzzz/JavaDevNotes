package DesignPatterns.Singleton;

public class Singleton {

    // This is variable named instance that is intended to hold an object
    // (specifically, an object of the Singleton class).
    // --> 03. We cannot use a non-static variable inside a static method,
    // so, we have to make this static.
    private static Singleton instance = null;

    // --> 01. Creating a private constructor so that other classes cannot create objects
    // Only methods/constructors within the same class can invoke it.
    private Singleton() {}


    // --> 02. We cannot create an Object from outside this class due to the private constructor, and
    // We cannot call a non-static method without an object instance.
    // And we cannot call a non-static method from a static method (MAIN is a static method).
    // So, to provide the single instance and allow it to be accessed from static contexts (like the 'main' method)
    // without needing an initial object, this 'getInstance()' method MUST be static.
    // This allows us to call it directly on the class (e.g., Singleton.getInstance()).
    // As Main is a static method, we can create an object from Main class.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
