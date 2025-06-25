package concurrency02;

public class NumberPrinterC2 implements Runnable {
    private Integer input;

    // Parametrized Constructor
    public NumberPrinterC2(Integer input) {
        this.input = input;
    }

    @Override
    public void run() {
        System.out.println("Number : " + input + " - from "
                +  Thread.currentThread().getName());
    }
}
