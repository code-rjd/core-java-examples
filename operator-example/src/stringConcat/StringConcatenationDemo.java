package stringConcat;

import java.util.Scanner;

public class StringConcatenationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter first string");
        String firstString = scanner.nextLine();

        System.out.println(" Please enter second string");
        String secondString = scanner.nextLine();

        System.out.println(" output : " + firstString + secondString);

    }
}
