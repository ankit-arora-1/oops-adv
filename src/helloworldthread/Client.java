package helloworldthread;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        System.out.println(Thread
                .currentThread()
                .getName());
    }
}
