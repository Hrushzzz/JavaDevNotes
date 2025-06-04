package concurrency01;

public class NumberPrinter implements Runnable {
    private int num = 0;

    // Parametrized Constructor
    public NumberPrinter(int num) {
        this.num = num;
    }

    @Override
    public void run() {
            System.out.println("Number : " + num + " - "
                    +  Thread.currentThread().getName());
    }
}
