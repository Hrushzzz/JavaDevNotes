package concurrency03;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count(0);

        // *** Adder - Subtractor problem : General Version ***
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread addThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        addThread.start();
        subtractorThread.start();

        addThread.join();  // makes the main thread wait until the thread does not complete execution
        subtractorThread.join();

        System.out.println("Count is ::: "+ count.val);
    }
}
