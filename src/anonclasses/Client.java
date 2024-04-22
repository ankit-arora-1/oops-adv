package anonclasses;

public class Client {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Calling from a thread");
            }
        });

        t.start();
    }
}
