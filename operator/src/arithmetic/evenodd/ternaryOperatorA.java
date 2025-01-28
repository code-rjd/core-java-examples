package arithmetic.evenodd;

import java.util.Scanner;

public class ternaryOperatorA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the value");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.println((no % 2 == 0) ? (" this is even no") : (" this is odd no"));

    }
}