package PCSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private Semaphore consumer;
    private Semaphore producer;

    public Consumer(Queue<Object> queue,
                    int maxSize,
                    Semaphore consumer,
                    Semaphore producer) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.consumer = consumer;
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumer.acquire();
                if(queue.size() > 0) {
                    System.out.println("Consuming");
                    queue.remove();
                }
                producer.release();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
