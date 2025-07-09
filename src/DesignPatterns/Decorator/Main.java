package DesignPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Icecream ic = new ChocolateSyrup(
                        new ChocolateScoop(
                                new OrangeCone(
                                        new ChocolateSyrup(
                                                new VanillaScoop(
                                                        new OrangeCone())))));

        System.out.println("Cost : " + ic.getCost());
        System.out.println("Description : " + ic.getDescription());
    }
}

// 1. Create an Interface / Abstract class that defines the thing that we are constructing.
// 2. Build the kind of items it can have.
// 3. Build in layers --> DECORATOR pattern
