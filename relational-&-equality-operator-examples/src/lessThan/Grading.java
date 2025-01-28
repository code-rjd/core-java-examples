package lessThan;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Student name ");
        String name = scanner.nextLine();
        System.out.println(" Enter grade out of 10");
        int grade = Integer.parseInt(scanner.nextLine());
        if ( grade < 5)
        {
            System.out.println(" FAIL");
        }
        else {
            System.out.println(" PASS");
        }
    }
}
