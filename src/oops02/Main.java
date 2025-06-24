package oops02;

public class Main {
    public static void main(String[] args) {

        // *** Inheritance  ***
//        Car car = new Car(4, "Bybre", "Ashton");
//        System.out.println(car.getNoOfWheels());

        ElectricCar electricCar = new ElectricCar(4, "XEON LED", "MATRIX LED", 5000);
        electricCar.printCar();

        // *** Polymorphism  ***

        // Method Overloading::
        /*
        Class(int, int)
        Java identifies a method by its method signature, not by the method name
        Method Signature -> name + corresponding args with data types
        */
        Calculator calculator = new Calculator();
        calculator.add(8,9);
        calculator.add(5.3, 6);
        calculator.add(8,9.9);
        calculator.add(4.2, 3.3);


        // Method Overriding ::
        /*
        For it to be overriding, the method in the child class must have:
        the exact same method signature as the method in the parent class. This means:
        Same method name
        Same number of parameters
        Same data types of parameters
        Same order of data types of parameters
         */

        Car car = new Car();
        car.startEngine();

        ElectricCar ec = new ElectricCar();
        ec.startEngine();
    }
}
