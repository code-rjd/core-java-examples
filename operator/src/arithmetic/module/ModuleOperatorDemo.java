package arithmetic.module;

import java.util.Scanner;

public class ModuleOperatorDemo {
        // if no is divisible by 2-->> output
        // if no is divisible by 2 -->> what is remainder

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the value");
        int no = Integer.parseInt(scanner.next());
        System.out.println(" please enter the divisible value");
        int divisibleValue = Integer.parseInt(scanner.next());

        int output = no / divisibleValue;
        int remainder = no % divisibleValue;
        System.out.println("        Division output = " + output);
        System.out.println("        Division Remainder = " + remainder);

    }

}
