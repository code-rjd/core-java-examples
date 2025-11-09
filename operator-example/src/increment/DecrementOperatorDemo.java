package increment;

import java.util.Scanner;

public class DecrementOperatorDemo {
    public static void main(String[] args) {
        //pseudo code
        // decrement operator - accept one value from user and print (no - 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter a positive no");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println(" Entered value = " + no);


        System.out.println(" Decrement value : " + no--);
        System.out.println(" Actual decremented value = "+ no);

        System.out.println(" Next Decrement value : " + --no);

    }
}
