package constructorchaining;

public class D extends C {
    public D(int x, int y, int z, int m) {
        System.out.println("Calling from D: " + x);
    }
}
