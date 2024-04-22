package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        example7();
    }

    public static void example1() {
        List<Integer> list = List.of(1,2,3,4,5,6);

        Stream<Integer> stream = list.stream();

        // Terminal methods -> they end the stream
        stream.forEach((ele) -> {
            System.out.println(ele);
        });
    }

    public static void example2() {
        List<Integer> list = List.of(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();

        // Terminal methods -> they end the stream
        stream.forEach((ele) -> {
            System.out.print(ele * ele + " ");
        });

    }

    public static void example3() {
        List<Integer> list = List.of(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();

        stream
                .map((ele) -> ele * ele)
                .forEach((ele) -> {
            System.out.print(ele + " ");
        });
    }

    public static void example4() {
        List<Integer> list = List.of(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();

        stream
                .filter((ele) -> ele % 2 == 0)
                .map((ele) -> ele * ele)
                .forEach((ele) -> {
                    System.out.print(ele * ele + " ");
                });

        System.out.println(list);
    }

    public static void example5() {
        List<Integer> list = List.of(1,2,3,4,5,6);

        // int sum = 0; // not allowed to update this inside lambda
        list.stream().reduce(0, (sum, ele) -> {
            return sum + ele;
        });
    }

    public static void example6() {
        List<Integer> list = List.of(1,2,3,4,5,6);

        for(int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

        Optional<Integer> integerOptional = list
                .stream()
                .map((ele) -> {
                    System.out.println(ele);
                    return ele * ele;
                })
                .findFirst();
    }

    public static void example7() {
        List<Integer> list = List.of(1,2,3,4,5,6);
        list.parallelStream().forEach((ele) -> {
            System.out.println("printing from thread: " + Thread.currentThread().getName());
        });
    }

    public static void example8() {
        List<Integer> list = List.of(1,2,3,4,5,6);

        List<Integer> modifiedList = list.stream()
                .filter((ele) -> ele % 2 == 0)
                .map((ele) -> ele * ele)
                .collect(Collectors.toList());

    }

    public static void example9() {
        List<Integer> list = new ArrayList<>();
        list.add(1);

         List<Integer> list2 = List.of(1,2,3,4);
         list2.stream().map((ele) -> {
             list.add(ele);
             return 1;
         });
    }

}
