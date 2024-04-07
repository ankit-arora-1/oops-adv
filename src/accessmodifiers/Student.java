package accessmodifiers;

public class Student {
    public String name;
    int age;
    protected double psp;
    private String univName;

    public void doSomething() {
        name = "asdfsa";
        age = 10;
        psp = 1.0;
        univName = "abc";

        Student student = new Student();
        student.univName = "abc";
    }

    public String getUnivName() {
        return univName;
    }
}
