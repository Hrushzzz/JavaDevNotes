package concurrency03;

public class SubtractorSync implements Runnable {

    private Count count;

    public SubtractorSync(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            synchronized (count) {   // equivalent to mutex.lock()
                count.val--;
            }   // equivalent to mutex.unlock()
        }
    }
}
