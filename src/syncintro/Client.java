package syncintro;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subctractor subctractor = new Subctractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subctractor);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println(count.count);
    }
}
