package oops3;

public class Main {
    public static void main(String[] args) {

        // *** INTERFACES ***

        /*
        Interface - forces the child class to implement the methods written in the interface
        CLASS -> methods already available for implementation

        Is it mandatory to perform all methods declared in Interface.
        We cannot create normal methods in Interface.

        Most methods inside an interface are implicitly abstract by default,
        meaning they have no implementation and must be implemented by concrete classes.
        However, since Java 8, interfaces can also contain default, static, and private methods,
        do have implementations.
        */


        // *** ABSTRACT CLASSES ***
        // Abstract methods are the methods that have no implementation, they only have method declaration.
        // For methods in interfaces that are intended to be implemented by concrete classes, the abstract keyword is optional because it's implicit.
        // For methods in abstract classes that are intended to have no implementation, the abstract keyword is mandatory.
        // You cannot create objects (instances) of an abstract class in Java because abstract classes are fundamentally incomplete.


        // *** STATIC variables and STATIC methods ***

        Computer c1 = new Computer();
        c1.setRam(4);
        Computer c2 = new Computer();
        c2.setRam(8);
        Computer c3 = new Computer();
        c3.setRam(16);
        Computer c4 = new Computer();
        c4.setRam(32);

        System.out.println(c1.getRam());
        System.out.println(c2.getRam());
        System.out.println(c3.getRam());
        System.out.println(c4.getRam());

        c1.setCpuArch("Intel");
        System.out.println(c3.getCpuArch());

        Computer.setCpuArch("Qualcomm");
        System.out.println(c4.getCpuArch());

    }
}

/*
Try ::
 1. Create static method and try to access non-static attributes from the class
    inside the method
    2. Create non-static method and try to access static attributes from the class
    inside the method
    3. Try to overload and override static methods
 */
