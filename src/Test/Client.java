package Test;

public class Client {
    public static void main(String[] args) {
        Test<String> test = new Test<String>();
        String s = test.test;

        test.doSomething(1);
    }
}
