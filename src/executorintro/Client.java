package executorintro;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        Executor executor = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 1; i <= 100; i++) {
            if(i == 5 || i == 12 || i == 15) {
                System.out.println("DEBUG");
            }

            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        executorService.shutdown();
    }
}
