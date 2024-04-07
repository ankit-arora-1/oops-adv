package overriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("asdfsd");

        B b = new B();
        b.doSomething("asdas");

        A a1 = new B();
        a1.doSomething("Asdas");

        A obj = new C();
        obj.doSomething("asdfasd");
    }
}
