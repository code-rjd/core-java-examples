package bitwiseOperator;

import java.util.Scanner;

public class BitwiseOrOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first value");
        int value1 = Integer.parseInt(scanner.nextLine());

        System.out.println("enter second value");
        int value2 = Integer.parseInt(scanner.nextLine());

        int output = value1 | value2;
        System.out.println("output=" + output);
    }
}