package concurrency02;

import java.util.concurrent.Callable;

public class FibonacciUsingFixedThreadPool implements Callable<Integer> {

    public int fib(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fib(num-1) + fib(num-2);
    }

    @Override
    public Integer call() throws Exception {
        return 0;
    }
}
