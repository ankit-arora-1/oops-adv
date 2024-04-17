package genericsintro;

import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.first = "abc";
        pair.second = 1;
        pair.setFirst("abcd");
        pair.setSecond(1);

        String s = pair.getFirst();
        Integer i = pair.getSecond();

        Pair<Integer, Integer> pair2 = new Pair<>();
        pair2.first = 1;
        pair2. second = 2;
    }
}
