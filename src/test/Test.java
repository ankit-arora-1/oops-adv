package test;

public class Test extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(()->{
            for(int i =0;i<50;i++)
                System.out.println("calling "+i);
        });
        Thread t = new Thread(()->{
            Test qa = new Test();
            for(int i =0;i<50;i++)
                qa.doSomething();
        });
        t.setDaemon(true);
        t.setName("bro");
        t.setPriority(2);
        t1.start();
        t.start();

        for(int i =0;i<50;i++){
            System.out.println(i+" value");
        }
    }
    public void doSomething() {
        System.out.println(Thread.currentThread().getName());
    }
}