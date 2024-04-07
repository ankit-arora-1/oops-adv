package testitnerface;

public interface A {
    public default void doSomething() {
        System.out.println("doing something");
    }
}
