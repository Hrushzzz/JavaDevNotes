package concurrency02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingFixedThreadPool implements Callable<Integer> {

    private int n;

    public FibonacciUsingFixedThreadPool(int n) {
        this.n = n;
    }

//    public int fib(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fib(n-1) + fib(n-2);
//    }

    @Override
    public Integer call() throws Exception {
        System.out.println(n + " : from Thread" + Thread.currentThread().getName());
        if (n <= 1) {
            return n;
        }
        // Creating a FixedThreadPool:
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //fib(n-1) + fib(n-2); :
        Future<Integer> futureAns1 =  executorService.submit(new FibonacciUsingFixedThreadPool(n-1));
        Future<Integer> futureAns2 =executorService.submit(new FibonacciUsingFixedThreadPool(n-2));
        // execute has void return type, so we have to use "submit" over here to catch some result.
        // futureAns1 and futureAns2 are like receipts, which are waiting for the output.
        //  --> FUTURE interface in Java primarily to represent the result of an asynchronous computation.
        //  It acts as a handle or a placeholder for a value that may not be available yet,
        //  but will be at some point in the future.
        // Future is like a receipt kind of thing during a blood test.

        int ans1 = futureAns1.get();
        int ans2 = futureAns2.get();
        // Here we are giving the receipt and taking the reports/answer.

        return ans1 + ans2;
    }
    // Here in the above scenario, we ended up creating Multiple Thread Pools,
    // each thread pool containing 2 threads.
    // So, In scenarios where we will not able to figure out, how many threads we need,
    // We can make use of the CachedThreadPool.
}
