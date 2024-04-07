package testitnerface;

public interface B extends A {
    public default void doSomething() {
        System.out.println("doing somerhing");
    }
}
