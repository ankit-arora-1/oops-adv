package mergersort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(2,3,4,1,5,6,7,8);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(list, executorService);

        Future<List<Integer>> sortedArr = executorService.submit(sorter);

        System.out.println(sortedArr.get());
    }
}
