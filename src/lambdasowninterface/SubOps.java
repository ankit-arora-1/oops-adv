package lambdasowninterface;

public class SubOps implements MathOperation {
    @Override
    public int ops(int a, int b) {
        return a - b;
    }
}
