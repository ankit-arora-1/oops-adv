package mergersort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public Sorter(List<Integer> arr, ExecutorService executorService) {
        arrayToSort = arr;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;

        List<Integer> leftArr = new ArrayList<>();
        for(int i = 0; i < mid; i++) {
            leftArr.add(arrayToSort.get(i));
        }

        List<Integer> rightArr = new ArrayList<>();
        for(int i = mid; i < arrayToSort.size(); i++) {
            rightArr.add(arrayToSort.get(i));
        }

        Sorter leftSorter = new Sorter(leftArr, executorService);
        Sorter rightSorter = new Sorter(rightArr, executorService);


        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSorterArrayFuture = executorService.submit(rightSorter);

        int i = 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSorterArray = rightSorterArrayFuture.get();
        while(i < leftSortedArray.size() && j < rightSorterArray.size()) {
            if(leftSortedArray.get(i) < rightSorterArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSorterArray.get(j));
                j++;
            }
        }

        while(i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSorterArray.size()) {
            sortedArray.add(rightSorterArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
