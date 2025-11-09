package anotherExample.memberInner;

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        ParentOuterClass parentOuterClass = new ParentOuterClass();
        ParentOuterClass.MemberInnerClass memberInnerClass = parentOuterClass.new MemberInnerClass();

        memberInnerClass.printMessage();

    }
}
