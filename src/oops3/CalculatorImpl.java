package oops3;

public class CalculatorImpl implements ICalculator {

    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a - b);
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    @Override
    public void divide(int a, int b) {
        System.out.println(a / b);
    }

}

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