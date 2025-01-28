package greaterThan;

import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the name of event ");
        String name = scanner.nextLine();
        System.out.println("Enter number of participant");
        int no = Integer.parseInt(scanner.nextLine());
        if ( no > 200 ){
            System.out.println(" PROCEED , the minimum required number of participants are present");
        }
        else {
            System.out.println(" WAIT , the minimum required number of participants are yet to participate");
        }
    }
}
