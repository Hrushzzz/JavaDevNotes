package concurrency01;

public class SumCalculator implements Runnable {

    private int N;
    private int sum = 0;

    public SumCalculator(int N) {
        this.N = N;
    }

    @Override
    public void run() {
        for (int i = 0; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum is ::: " + sum + " from thread " + Thread.currentThread().getName());
    }
}
