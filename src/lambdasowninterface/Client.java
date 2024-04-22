package lambdasowninterface;

public class Client {
    public static void main(String[] args) {
        MathOperation mathOperation = new AddOps();
        int addRes = mathOperation.ops(1,2);
        System.out.println(addRes);


        int subRes = executeOps(1, 2, (a, b) -> {
            return a - b;
        });

        int mulRes = executeOps(1,2, (a, b) -> {
            return a * b;
        });

        MathOperation mathOperation1 = (a,b) -> a-b;
        executeOps(2,3, mathOperation1);

        // Break for 7 minutes: 8:14 -> 8:21
    }

    public static int executeOps(int a, int b, MathOperation mathOperation) {
        return mathOperation.ops(a, b);
    }
    public static void print() {
        System.out.println("printing");
    }
}
