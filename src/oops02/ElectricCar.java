package oops02;

public class ElectricCar extends Car{
    public int batteryCapacity;

    public ElectricCar(int noOfWheels, String headLight, String brakeLight, int batteryCapacity) {
        super(noOfWheels, headLight, brakeLight);
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(int noOfWheels) {
        super(noOfWheels);  // super. and super() // super() -> means calling the parent constructor with required values
        // super() should always be the first line of the constructor
        System.out.println("Inside ElectricCar");
    }

    public ElectricCar(String headLight, String brakeLight) {
        super(headLight, brakeLight);
        System.out.println("Inside ElectricCar");
    }

    public ElectricCar() {
        super();
        System.out.println("Print from ElectricCar");
    }

    public void printElectricCarWheels() {
        System.out.println("Number of Wheels: " + super.getNoOfWheels());
    }

    @Override  // does nothing, just for better readability and verifies override, adding or removing this won't impact method overriding
    public void startEngine() {
        System.out.println("Starting electric motor from battery in electric car");
    }
}

// super == Parent
