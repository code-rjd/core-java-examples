package arithmetic.evenodd;

import java.util.Scanner;

public class ternaryOperatorB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the value");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.println( "this is " + ((no % 2 == 0) ? (" even...") : ("Odd ..")));

    }}
