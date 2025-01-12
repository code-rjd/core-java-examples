package rational;

import java.util.Scanner;

public class PositiveNegativeDemo {


    //pseudo code
    //identify value is positive or negative

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value");
        int no = Integer.parseInt(scanner.nextLine());

        if (no > 0) {
                                                                // <,>,<=,>=,=!=
            System.out.println("no is positive");
                                                                // what to do - if section is true
        }
        else {
            System.out.println("no is negative");
        }
    }
}
