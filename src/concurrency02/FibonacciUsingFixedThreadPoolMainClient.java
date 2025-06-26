package concurrency02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingFixedThreadPoolMainClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Normal Version ::
        FibonacciNumber fibonacciNum = new FibonacciNumber();
        int answer = fibonacciNum.fib(9);
//        System.out.println("answer is :: " + answer);

        // FibonacciUsingFixedThreadPool ::

        // Here I want to make the root call/ top-most call i.e fib(n),
        //So, instead of engaging MAIN thread, I am creating a new thread and using it.
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        // We have to use "submit", if we have to catch some value.
        Future<Integer> futureAns = executorService.submit(new FibonacciUsingFixedThreadPool(6));
        System.out.println(futureAns.get());
    }
}
