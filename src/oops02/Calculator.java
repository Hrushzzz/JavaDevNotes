package oops02;

public class Calculator {

    // Method Overloading ::

    public void add(int x, int y) {
        System.out.println(x+y);
    } // add(int, int)

    public void add(double x, int y){
        System.out.println(x+y);
    } // add(double,int)

    public void add(int x, double y){
        System.out.println(x+y);
    } // add(int,double)

    public void add(double x, double y){
        System.out.println(x+y);
    } // add(double,double)
}
