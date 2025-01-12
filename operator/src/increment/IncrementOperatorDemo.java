package increment;

import java.util.Scanner;

public class IncrementOperatorDemo {
    public static void main(String[] args) {
        //pseudo code
        // increment operator - accept one value from user and print (no + 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter a positive no");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println(" Entered value = "+ no);


        System.out.println(" Increment value : " + no++);
        System.out.println(" Actual Entered value = "+ no);

        System.out.println(" Next Increment value : " + ++no);

    }
}
