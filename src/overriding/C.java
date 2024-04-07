package overriding;

public class C extends A {
    @Override
    public void doSomething(String s) {
        System.out.println("calling from C");
    }
}
