package mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;
    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            lock.lock();
            count.count += i;
            lock.unlock();
        }
    }

    // Break for 7 minutes: 8:21 -> 8:28
}
