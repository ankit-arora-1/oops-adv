package producerconsumerintro;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Object> queue;
    private int maxSize;

    public Consumer(Queue<Object> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                if(queue.size() > 0) {
                    System.out.println("Consuming");
                    queue.remove();
                }
            }
        }
    }
}
