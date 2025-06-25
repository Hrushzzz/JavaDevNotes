package concurrency02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinterExecutorMainClient {
    public static void main(String[] args) {

        // Creating a FixedThreadPool :: (no.of threads = 2)
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // running it ::
        for (int i = 1; i < 1000; i++) {
            executorService.execute(new NumberPrinterC2(i));
        }
    }
}
