package lessThanEqualTo;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter name applicant ");
        String name = scanner.nextLine();
        System.out.println(" Enter age");
        int age = Integer.parseInt(scanner.nextLine());
        if ( age <= 60)
        {
            System.out.println(" Applicant eligible for loan");
        }
        else {
            System.out.println(" Applicant not eligible for loan");
        }
    }
}
