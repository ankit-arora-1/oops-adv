package lambdasintro;

import comparableandcomparator.MileageComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("asdas");
        };

        Thread thread = new Thread(() -> {
            System.out.println("Printing from another thread");
        });

        thread.start();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(7);

        Collections.sort(list, (Integer i1, Integer i2) -> {
            return i1 - i2;
        });

        Collections.sort(list, (i1, i2) -> {
            return i1 - i2;
        });

        Collections.sort(list, (i1, i2) -> i1 - i2);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            return 1;
        });
    }
}
