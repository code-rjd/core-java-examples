package equality;

import java.util.Scanner;

public class NotEqualsToOperatorDemo {

    // pseudo code
    // if no is equal to 100 or not
    // ? print good no.
    // : print bad no
    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.parseInt(input) !=100)
        {
            System.out.println("non-matching  - non-century");
        }
        else {
            System.out.println("matching - century");
        }
    }
}
