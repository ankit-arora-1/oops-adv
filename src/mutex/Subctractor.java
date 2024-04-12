package mutex;

import java.util.concurrent.locks.Lock;

public class Subctractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subctractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            lock.lock();
            count.count -= i;
            lock.unlock();
        }
    }
}
