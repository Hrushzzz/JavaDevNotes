package concurrency03;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // V1 :::  *** Adder - Subtractor problem : General Version ***
        /*
        Count count = new Count(0);

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread addThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        addThread.start();
        subtractorThread.start();

        addThread.join();  // makes the main thread wait until the thread does not complete execution
        subtractorThread.join();

        System.out.println("Count in General Version ::: "+ count.val);
         */


        // V2 ::: *** Adder - Subtractor problem : Solving Using Mutex ***
        /*
        ReentrantLock mutex = new ReentrantLock();
        Count count = new Count(0);

        AdderMutex adderMutex = new AdderMutex(count, mutex);
        SubtractorMutex subtractorMutex = new SubtractorMutex(count, mutex);

        Thread adderThread = new Thread(adderMutex);
        Thread subtractorThread = new Thread(subtractorMutex);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Count in Mutex Version ::: "+ count.val);
         */


        // V3 ::: *** Adder - Subtractor problem : Solving Using "Synchronized keyword" ***
        /*
        Count count = new Count(0);

        AdderSync adderSync = new AdderSync(count);
        SubtractorSync subtractorSync = new SubtractorSync(count);

        Thread adderThread = new Thread(adderSync);
        Thread subtractorThread = new Thread(subtractorSync);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Count in Synchronized keyword Version ::: "+ count.val);
         */


        // V5 ::: *** Adder - Subtractor problem : Solving Using "Atomic Integer" ***
        AtomicInteger count = new AtomicInteger(0);

        AdderAtomicInteger adderAtomicInteger = new AdderAtomicInteger(count);
        SubtractorAtomicInteger subtractorAtomicInteger = new SubtractorAtomicInteger(count);

        Thread adderThread = new Thread(adderAtomicInteger);
        Thread subtractorThread = new Thread(subtractorAtomicInteger);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Count in AtomicInteger Version ::: " + count.get());

    }
}
