package DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();
        maps.findPath("Kurnool", "Hyderabad", TransportMode.CAR);
    }
}
