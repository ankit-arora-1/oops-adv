package synchronizedmethods;

public class Count {
    private int count = 0;

    public synchronized void incrValue(int i) {
        count += i;
    }

    public int getValue() {
        return count;
    }

}
