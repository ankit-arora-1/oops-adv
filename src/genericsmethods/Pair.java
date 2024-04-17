package genericsmethods;

public class Pair<K, V> {
    private K first;
    private V second;


    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    // Placeholders at method level
    public static <T, S> S doSomething(T first, S second) {
        System.out.println(first);
        System.out.println(second);

        return second;
    }

    public <E, V> V doSomething2(E val) {
        System.out.println(val);
        V test = (V) val;
        return (V) "asdas";

        // Break for 7 minutes: 8:10 -> 8:17
    }
}
