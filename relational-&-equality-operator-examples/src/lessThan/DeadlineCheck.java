package lessThan;

import java.util.Scanner;

public class DeadlineCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Project name ");
        String name = scanner.nextLine();
        System.out.println(" Enter date of completion ");
        int date = Integer.parseInt(scanner.nextLine());
        if (date < 15) {
            System.out.println(" Project completed before deadline");
        } else {
            System.out.println(" ALERT ::: Project completed after deadline");
        }
    }
}
