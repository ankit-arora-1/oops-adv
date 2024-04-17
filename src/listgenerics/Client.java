package listgenerics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogsTemp = new ArrayList<>();
        Test.doSomething(animals);
        // Test.doSomething(dogsTemp);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        Test.doSomething2(dogs);

        List<String> strings = new ArrayList<>();
        // Test.doSomething2(strings);
    }
}
