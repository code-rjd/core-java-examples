package anotherExample.memberInner;

public class ParentOuterClass {
    private String message = "Hello from parent outer class";

    class MemberInnerClass{
        void printMessage(){
            System.out.println("Message : " + message);
        }
    }
}
