package excedptionsintro;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Student student = new Student();
//        int score = student.getScore();
        // student.readFile();
//        System.out.println("The score is: ");
//        test(); // exception occurs at this line
//        System.out.println("Just called test");

        student.doSomething2();

    }

    public static void test() throws FileNotFoundException {
        Student student = new Student();
        student.readFile2(); // -> Exception thrown at this line
        System.out.println("Printing from test");
    }
}
