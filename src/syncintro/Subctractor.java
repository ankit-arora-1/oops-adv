package syncintro;

public class Subctractor implements Runnable {
    private Count count;

    public Subctractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            count.count -= i;
        }
    }
}
