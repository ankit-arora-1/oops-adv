package collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("sohail");
        hashSet.add("satish");
        hashSet.add("vishal");
        hashSet.add("jay");
        hashSet.add("arvind");

//        System.out.println(hashSet);

        linkedHashSet.add("sohail");
        linkedHashSet.add("satish");
        linkedHashSet.add("vishal");
        linkedHashSet.add("jay");
        linkedHashSet.add("arvind");

//        System.out.println(linkedHashSet);

        treeSet.add("sohail");
        treeSet.add("satish");
        treeSet.add("vishal");
        treeSet.add("jay");
        treeSet.add("arvind");

//        System.out.println(treeSet);


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(7);
        pq.add(8);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
