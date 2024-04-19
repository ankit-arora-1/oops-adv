package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(100, 20));
        carList.add(new Car(200, 15));
        carList.add(new Car(75, 25));
        carList.add(new Car(80, 30));

        Collections.sort(carList);

        for(Car car: carList) {
            System.out.println(car);
        }
    }
}
