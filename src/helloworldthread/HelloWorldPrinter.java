package helloworldthread;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println(
                "Printing hello world from: " +
                        Thread.currentThread()
                                .getName());


        doSomething();
    }

    public void doSomething() {

    }
}
