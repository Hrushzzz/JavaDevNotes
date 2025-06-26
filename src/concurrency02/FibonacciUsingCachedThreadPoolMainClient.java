package concurrency02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingCachedThreadPoolMainClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        // We have to pass this executorService as it is a ThreadPool
        // and contains all the threads within it.

        Future<Integer> futureAns =
                executorService.submit(new FibonacciUsingCachedThreadPool(3, executorService));

        System.out.println(futureAns.get());
    }
}
