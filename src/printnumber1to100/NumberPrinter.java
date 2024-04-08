package printnumber1to100;

public class NumberPrinter implements Runnable{
    private int num;

    public NumberPrinter(int n) {
        num = n;
    }

    @Override
    public void run() {
        System.out.println("Printing: " +
                num +
                " from thread: " +
                Thread.currentThread().getName());
    }
}
