package accessmodifiers;

public class StudentChild extends Student {
    public void doSomething() {
         name = "jeeshan";
         age = 10;
         psp = 5.0;
         // univName = "abc"; --> Wont work because private
    }
}
