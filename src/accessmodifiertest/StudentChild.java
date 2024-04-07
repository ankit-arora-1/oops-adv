package accessmodifiertest;

import accessmodifiers.Student;

public class StudentChild extends Student {
    public void doSomething() {
        name = "Anup";
         // age = 10; --> Wont work because default
        psp = 10.0;
        // univName = "abc"; -->won't work because priavate
    }
}
