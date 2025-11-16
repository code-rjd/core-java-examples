import java.util.function.Predicate;

public class PredicateDemo {

    //old fashioned
    //    public static void main(String[] args) {
//
//        PredicateDemo demo = new PredicateDemo();
//        System.out.println(" no greater than 100?" + demo.noGreaterThan100(114));
//    }
//    public boolean noGreaterThan100(int num) {
//        return num > 100;
//    }
    public static void main(String[] args) {
        Predicate<Integer> noGreaterThan100 = (no) -> no>100;
        System.out.println("No greater than 100?" + noGreaterThan100.test(114));

        Predicate<String> isStringContainsZero = (input) -> input.contains("0");
        Predicate<String> isStringDoesntContainsZero = Predicate.not(isStringContainsZero);
        System.out.println("String contains zero?" + isStringContainsZero.test("0pune"));
        System.out.println("String contains zero?" + isStringContainsZero.test("radheya100"));
        System.out.println("String does NOT contains zero?" + isStringDoesntContainsZero.test("0pune"));
    }
}
