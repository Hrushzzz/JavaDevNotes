package oops01;

public class Iphone {
    public int version;
    public int processorNumber;
    public int price;
    public String model;
    public String brand;
    public int displaySize;
    public int ram;
    public int batterySize;

    public Iphone(int version, int processorNumber, int price, String model,
                  String brand, int displaySize, int ram, int batterySize) {
        this.version = version;
        this.processorNumber = processorNumber;
        this.price = price;
        this.model = model;
        this.brand = brand;
        this.displaySize = displaySize;
        this.ram = ram;
        this.batterySize = batterySize;
    }

    // Copy Constructor
    public Iphone(Iphone phone) {
        this.version = phone.version + 1;
        this.processorNumber = phone.processorNumber + 1;
        this.price = phone.price + 5000;
        this.model = phone.model;
        this.brand = phone.brand;
        this.displaySize = phone.displaySize;
        this.ram = phone.ram;
        this.batterySize = phone.batterySize;
    }
}
