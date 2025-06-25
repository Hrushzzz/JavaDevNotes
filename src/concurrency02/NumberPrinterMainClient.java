package concurrency02;

public class NumberPrinterMainClient {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread(new NumberPrinterC2(i));
            t.start();
        }
    }
}
