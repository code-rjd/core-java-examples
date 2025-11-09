package anotherExample.staticInner;

public class StaticClassDemo {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer.Inner();
        inner.country = "INDIA";
        inner.state = "Maharashtra";
        inner.printData();
    }
}
