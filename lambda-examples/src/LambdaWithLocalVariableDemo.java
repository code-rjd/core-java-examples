
public class LambdaWithLocalVariableDemo {
    public static void main(String[] args) {

      Interest interest = (principleAmount, interestRate) -> {
           int years = 10;
            return principleAmount * (interestRate / 100) * years;
        };
      double totalInterest = interest.calculate(25000,8.1f);
      System.out.println("Total Interest: " + totalInterest);
    }
}