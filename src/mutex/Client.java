package mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Subctractor subctractor = new Subctractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subctractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.count);
    }
}
