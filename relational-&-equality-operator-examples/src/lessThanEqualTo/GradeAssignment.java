package lessThanEqualTo;

import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter student name  ");
        String name = scanner.nextLine();
        System.out.println(" Enter score out of 100");
        int score = Integer.parseInt(scanner.nextLine());
        if ( 40 <= score)
        {
            System.out.println("PASS ");
        }
        else {
            System.out.println(" FAIL ");
        }
    }
}
