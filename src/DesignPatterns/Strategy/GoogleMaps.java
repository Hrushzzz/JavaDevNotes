package DesignPatterns.Strategy;

public class GoogleMaps {

    public void findPath(String source, String destination, TransportMode mode) {

        PathCalculator pc = PathCalculatorFactory.getPathCalculator(mode);
        // Here we used FACTORY pattern to create an object.
        //we can assume,whenever strategy is used,factory design pattern is used for object creation.
        pc.findPath(source, destination);
    }
}
