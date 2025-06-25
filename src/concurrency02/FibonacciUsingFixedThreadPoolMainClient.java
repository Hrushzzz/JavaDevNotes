package concurrency02;

public class FibonacciUsingFixedThreadPoolMainClient {
    public static void main(String[] args) {

        // Normal Version ::
        FibonacciNumber fibonacciNum = new FibonacciNumber();
        int answer = fibonacciNum.fib(9);
        System.out.println("answer is :: " + answer);
    }
}
