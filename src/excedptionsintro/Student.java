package excedptionsintro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class Student {
    public int getScore() {
        System.out.println("Getting the score for the student");
        int score = 1 / 0;
        System.out.println("Score calculated");
        return score;
    }

    public void readFile() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Trying to read file");
        } catch (FileNotFoundException ex) {
            System.out.println("Some error happened. File not found");
        }


        System.out.println("Reading of file done");
    }

    public void readFile2() throws FileNotFoundException {
        System.out.println("Trying to read file");
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);

        System.out.println("Reading of file done");
        System.out.println("Bye bye");
    }

    public void test() {
        try {

            if(true) {
                throw new SQLException();
            }

            File file = new File("abc");
            FileReader fileReader = new FileReader(file);

        } catch (SQLException ex) { // Good practice: Always catch specific exceptions
            System.out.println("SQL exception occurred");
            // throw new FileNotFoundException(); --> Won't be caught by the below catch block
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (Exception ex) {
            System.out.println("Some exception occurred");
            // throw new UserNotFoundException("User is not found");
        }

        // Difference between throw and throws
        // throw -> when I have to actually throw an exception
        // throws -> to declare that my method contains dangerous code
    }

    public void doSomething() {
        try {
            System.out.println("doing something");
            if(false) {
                throw new FileNotFoundException();
            }

            // return 1;

        } catch (FileNotFoundException ex) {
            System.out.println("Some exception occurred");
        } finally { // -> Called no matter what even if there is a return
            // usually to do clean up resources
            System.out.println("Always called");
            // return 2;
        }
    }

    public void doSomething2() {
        doSomething2();
    }

    // Difference between final, finally and finalize
    // finalize() -> Method that is called when an object is about to be garbage collected
}
