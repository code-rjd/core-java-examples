package anotherExample.staticInner;

public class Outer {
    public String city;

    static class Inner {
        public String country;
        public String state;

        public void printData() {
            System.out.println("State is " + state + " | Country is "  + country);
        }
    }
}
