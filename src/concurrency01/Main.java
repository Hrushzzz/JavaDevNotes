package concurrency01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, from thread: "
                + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();

        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t2 = new Thread(numberPrinter);
            t2.start();
        }

    }
}


/*
Java - by default is single-threaded - main thread

How to code a "multithreaded" program in Java :::

-> Setup:
1. Figure out the task that you want to run independently (on a different thread).
2. Create a "class" for that task.
3. Implement "Runnable" interface in the class.
4. Implement "run()" method with the task.
-> Execution:
5. Create the Object of "task" class.
6. Create thread using task class.
7. Run the thread.

*/