package DesignPatterns.Strategy;

public class CarPathCalculator implements PathCalculator {

    @Override
    public void findPath(String source, String destination) {
        // algo for finding path via Car
        System.out.println("Find path via Car");
    }
}
